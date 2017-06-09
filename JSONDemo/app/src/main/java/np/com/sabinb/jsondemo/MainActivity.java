package np.com.sabinb.jsondemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

     String output = "{\n" +
            "  \"speakers\": [{\n" +
            "    \"title\" : \"Art in Full Bloom\",\n" +
            "    \"name\": \"Lorenzo Garcia\",\n" +
            "    \"shortname\" : \"Lorenzo_Garcia\",\n" +
            "    \"summary\" : \"Drawing and painting flowers may seem like a first-year art student's assignment, but Lorenzo Garcia brings depth, shadows, light, form and color to new heights with his unique and revolutionary technique of painting on canvas with ceramic glaze. This session is sure to be a hit with mixed media buffs.\",\n" +
            "    \"description\": \"<p>Lorenzo was born in Mexico, but grew up in Southern California after his mother immigrated to Los Angeles when he was a year old. His mother worked as a seamstress in the Fashion District and brought home scrap materials for Lorenzo to create his early mixed media art. From that point on, Lorenzo became hooked on creating art from scrap metals, fabrics, wood, canvas, and many others. During his junior year at Bischon Art School in Los Angeles, he perfected his own proprietary method of painting on canvas with ceramic glaze, which he will demonstrate on Monday in his session, 'Art in Full Bloom'.</p><p>Lorenzo paints with an extraordinary amount of color, and prefers to create art centered around nature, animals, and science. Now in his senior year at Bischon, Lorenzo has been creating mixed media totem poles made from old telephone poles, and other recycled materials, and is already planning his next new technique that will likely inspire a trend for years to come.</p>\",\n" +
            "    \"artwork\": [\"Lorenzo_Garcia_01_tn.jpg\", \"Lorenzo_Garcia_02_tn.jpg\", \"Lorenzo_Garcia_03_tn.jpg\", \"Lorenzo_Garcia_04_tn.jpg\"]\n" +
            "  },{\n" +
            "    \"title\" : \"Deep Sea Wonders\",\n" +
            "    \"name\": \"Hilary Goldywynn Post\",\n" +
            "    \"shortname\" : \"Hillary_Goldwynn\",\n" +
            "    \"summary\": \"Hillary is a sophomore art sculpture student at New York University, and has won the major international prizes for painters, including the Divinity Circle and the International Painter's Medal. Hillary's exhibit features paintings that contain only water including waves, deep sea, and river.\",\n" +
            "    \"description\": \"<p>Hillary is a sophomore art sculpture student at New York University, and has already won all the major international prizes for new painters, including the Divinity Circle, the International Painter's Medal, and the Academy of Paris Award. Hillary's CAC exhibit features paintings that contain only water images including waves, deep sea, and river.</p><p>An avid water sports participant, Hillary understands the water in many ways in which others do not, or may not ever have the opportunity. Her goal in creating the CAC exhibit was to share with others the beauty, power, and flow of natural bodies of water throughout the world. In addition to the display, Hilary also hosts a session on Tuesday called Deep Sea Wonders, which combines her love of deep sea diving and snorkeling, with instruction for capturing the beauty of underwater explorations on canvas.</p>\",    \n" +
            "    \"artwork\" : [\"Hillary_Goldwynn_01_tn.jpg\" , \"Hillary_Goldwynn_02_tn.jpg\" , \"Hillary_Goldwynn_03_tn.jpg\" , \"Hillary_Goldwynn_04_tn.jpg\" , \"Hillary_Goldwynn_05_tn.jpg\" , \"Hillary_Goldwynn_06_tn.jpg\" , \"Hillary_Goldwynn_07_tn.jpg\"]\n" +
            "  },{\n" +
            "    \"title\" : \"The Art of Abstract\",\n" +
            "    \"name\": \"Riley Rudolph Rewington\",\n" +
            "    \"shortname\" : \"Riley_Rewington\",\n" +
            "    \"summary\": \"The leader of the MMA artistic movement in his hometown of Portland, Riley Rudolph Rewington draws a crowd wherever he goes. Mixing street performance, video, music, and traditional art, Riley has created some of the most unique and deeply poignant abstract works of his generation.\",\n" +
            "    \"description\": \"<p>Riley started out as musician and street performance artist, and now blends painting and photography with audio, video, and computer multimedia to create what he calls 'Music and Multimedia Artworks.' Riley's innovations in using multimedia to express art have created a youth culture movement in his town of Portland, in which he remains at the forefront. In his role as the founder of the MMA art form, Riley has become an inspiration to many up and coming artists. However, the part Riley insists is most important to him, is that he's helped many troubled youth take control of their lives, and create their own unique, positive futures. Seeing kids he's mentored graduate from high school and enroll in college, gives art the purpose that Riley so craves.</p><p>A first-year student at the Roux Academy of Art, Media, and Design, Riley is already changing the face of modern art at the university. Riley's exquisite abstract pieces have no intention of ever being understood, but instead beg the viewer to dream, create, pretend, and envision with their mind's eye. Riley will be speaking on the 'Art of Abstract' during Thursday's schedule.</p>\",\n" +
            "    \"artwork\" : [\"Riley_Rewington_01_tn.jpg\",\"Riley_Rewington_02_tn.jpg\",\"Riley_Rewington_03_tn.jpg\",\"Riley_Rewington_04_tn.jpg\",\"Riley_Rewington_05_tn.jpg\",\"Riley_Rewington_06_tn.jpg\"]\n" +
            "  }],\n" +
            "\n" +
            "  \"social\" : [{\n" +
            "    \"shortname\" : \"twitter\",\n" +
            "    \"img\" : \"/images/socialmedia/twitter.png\",\n" +
            "    \"url\" : \"http://www.twitter.com/rouxmeet\"\n" +
            "  },{\n" +
            "    \"shortname\" : \"facebook\",\n" +
            "    \"img\" : \"/images/socialmedia/facebook.png\",\n" +
            "    \"url\" : \"http://www.facebook.com/rouxmeet\"\n" +
            "  },{\n" +
            "    \"shortname\" : \"meetup\",\n" +
            "    \"img\" : \"/images/socialmedia/meetup.png\",\n" +
            "    \"url\" : \"http://www.meetup.com/rouxmeet/\"\n" +
            "  }],\n" +
            "\n" +
            "  \"meeting\" : {\n" +
            "    \"date\": \"Thursday, March 27th\",\n" +
            "    \"time\": \"6-9pm\",\n" +
            "    \"where\": {\n" +
            "      \"name\": \"Hotel Gwendoline\",\n" +
            "      \"img\": \"/images/misc/hotel_gwendoline.jpg\",\n" +
            "      \"address\": \"123 Elm Street\"\n" +
            "    }\n" +
            "  }\n" +
            "}";


    private ListView listView;
    private List<Speaker> speakerList;
    private SpeakerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        speakerList = new ArrayList<Speaker>();
        adapter = new SpeakerAdapter(getApplicationContext(), speakerList);
        listView.setAdapter(adapter);

        try {
            JSONObject result = new JSONObject(output);
            if(result.has("speakers")){
                JSONArray jsonArray = result.getJSONArray("speakers");
                //Log.i("MainActivity", "Speaker Length " + jsonArray.length());
                for(int i=0;i<jsonArray.length();i++){
                    Speaker speaker = new Speaker();
                 JSONObject jsonObject = jsonArray.getJSONObject(i);
                 //if(jsonObject.has("title") ){
                     Log.i("MainActivity", "Title :"+ jsonObject.getString("title"));
                     Log.i("MainActivity", "Name :"+ jsonObject.getString("name"));

                    speaker.setName(jsonObject.getString("name"));
                    speaker.setTitle(jsonObject.getString("name"));
                    speakerList.add(speaker);
                 //}

                }

                adapter.notifyDataSetChanged();

            }
            if(result.has("social")){
                JSONArray jsonArraySocial = result.getJSONArray("social");
                for(int i=0;i<jsonArraySocial.length();i++){
                    JSONObject jsonObjectSocial = jsonArraySocial.getJSONObject(i);
                    Log.i("MainActivity", "Short Name: "+ jsonObjectSocial.getString("shortname"));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

}
