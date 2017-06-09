package com.survey.householdsurvey;

import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.survey.householdsurvey.models.Answer;


public class MainActivity extends ActionBarActivity {

    //section A
    private Spinner districtSpinner;
    private EditText respondentNameEt;
    private RadioButton respondentMaleRb;
    private EditText respondentAgeEt;

    private EditText householdNameEt;
    private RadioButton householdMaleRb;
    private EditText householdAgeEt;

    private EditText vdcMunicipalityEt;
    private EditText wardNumberEt;
    private EditText villageToleEt;
    private EditText ethnicityOtherEt;

    private RadioGroup ethnicityRg;
    private RadioGroup educationalRg;

    private EditText familyMaleBelow6Et;
    private EditText familyFemaleBelow6Et;
    private EditText familyMale614Et;
    private EditText familyFemale614Et;
    private EditText familyMale1560Et;
    private EditText familyFemale1560Et;
    private EditText familyFemaleAbove60Et;
    private EditText familyMaleAbove60Et;

    private RadioGroup majorOccupationRg;
    private EditText majorOccupationOtherEt;

    //section B
    private RadioGroup cultivatedLandRg;
    private EditText totalCultivatedLandEt;
    private Spinner landUnitS;
    private Spinner landOwnershipTypeS;
    private EditText yearRoundIrrigationEt;
    private Spinner informationSourceForTechS;
    private Spinner usefulInformationSourceS;
    private EditText whySourceIsUsefulEt;

    private boolean doubleBackToExitPressedOnce = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Section A
        districtSpinner = (Spinner)findViewById(R.id.districtS);
        respondentNameEt = (EditText)findViewById(R.id.respondentNameEt);
        respondentMaleRb = (RadioButton)findViewById(R.id.respondentMaleRb);
        respondentAgeEt = (EditText)findViewById(R.id.respondentAgeEt);
        householdNameEt = (EditText)findViewById(R.id.householdNameEt);
        householdMaleRb = (RadioButton)findViewById(R.id.householdMaleRb);
        householdAgeEt = (EditText)findViewById(R.id.householdAgeEt);
        vdcMunicipalityEt = (EditText)findViewById(R.id.vdcMuniEt);
        wardNumberEt = (EditText)findViewById(R.id.wardNoEt);
        villageToleEt = (EditText)findViewById(R.id.villageToleEt);
        ethnicityRg = (RadioGroup)findViewById(R.id.ethnicityRg);
        ethnicityOtherEt = (EditText)findViewById(R.id.ethnicityEt);
        educationalRg = (RadioGroup)findViewById(R.id.educationRg);

        familyMaleBelow6Et = (EditText)findViewById(R.id.maleBelow6);
        familyFemaleBelow6Et = (EditText)findViewById(R.id.femaleBelow6);
        familyMale614Et = (EditText)findViewById(R.id.maleSix_14);
        familyFemale614Et = (EditText)findViewById(R.id.femaleSix_14);
        familyMale1560Et = (EditText)findViewById(R.id.maleFifteen_60);
        familyFemale1560Et = (EditText)findViewById(R.id.femaleFifteen_60);
        familyMaleAbove60Et = (EditText)findViewById(R.id.maleAbove60);
        familyFemaleAbove60Et = (EditText)findViewById(R.id.femaleAbove60);

        majorOccupationRg = (RadioGroup)findViewById(R.id.occupationRg);
        majorOccupationOtherEt = (EditText)findViewById(R.id.occupationOtherEt);


        ethnicityRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id==R.id.ethnicity5Rb){
                    ethnicityOtherEt.setEnabled(true);
                }else{
                    if(ethnicityOtherEt.isEnabled()){
                        ethnicityOtherEt.setText("");
                        ethnicityOtherEt.setEnabled(false);
                    }

                }
            }
        });

        majorOccupationRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id==R.id.occupation6Rb){
                    majorOccupationOtherEt.setText("");
                    majorOccupationOtherEt.setEnabled(true);
                }else{
                    if(majorOccupationOtherEt.isEnabled()){
                        majorOccupationOtherEt.setText("");
                        majorOccupationOtherEt.setEnabled(false);
                    }
                }
            }
        });

        //sectionB


                /*private RadioGroup cultivatedLandRg;
                private EditText totalCultivatedLandEt;
                private Spinner landUnitS;
                private Spinner landOwnershipTypeS;
                private EditText yearRoundIrrigationEt;
                private Spinner informationSourceForTechS;
                private Spinner usefulInformationSourceS;
                private EditText whySourceIsUsefulEt;*/

        cultivatedLandRg = (RadioGroup)findViewById(R.id.cultivableLandRG);
        totalCultivatedLandEt = (EditText)findViewById(R.id.cultivableLandEt);
        landUnitS = (Spinner) findViewById(R.id.cultivableLandUnitS);
        landOwnershipTypeS = (Spinner)findViewById(R.id.ownershipOfLandS);
        yearRoundIrrigationEt = (EditText)findViewById(R.id.irrigationLandEt);
        informationSourceForTechS = (Spinner)findViewById(R.id.sourceOfInfoS);
        usefulInformationSourceS = (Spinner)findViewById(R.id.sourceWithUsefulAdviceS);
        whySourceIsUsefulEt = (EditText)findViewById(R.id.mostUsefulSourceEt);


    }

    public void btnClick(View view){
        switch (view.getId()){
            case R.id.addBtn:
                Answer answer = new Answer();
                //Section A
                //district
                int position=districtSpinner.getSelectedItemPosition();
                answer.setDistrict(position+1);

                String responderName = respondentNameEt.getText().toString().trim();
                answer.setResponderName(responderName);

                int responderSex = 1;
                if(!respondentMaleRb.isChecked()){
                    responderSex = 2;
                }
                answer.setResponderSex(responderSex);
                //responder age
                setEditTextToZero(respondentAgeEt);
                String responderAge = respondentAgeEt.getText().toString().trim();
                try{
                    int respondentAgeI =Integer.parseInt(responderAge);
                    answer.setResponderAge(respondentAgeI);
                }catch (NumberFormatException e){

                    e.printStackTrace();
                }
                //household
                String householdName = householdNameEt.getText().toString().trim();
                answer.setHouseholdHead(householdName);

                int householdSex = 1;
                if(!householdMaleRb.isChecked()){
                    householdSex = 2;
                }
                answer.setHouseholdSex(householdSex);
                //household age
                setEditTextToZero(householdAgeEt);
                String householdAge = householdAgeEt.getText().toString().trim();
                try{
                    int householdAgeI =Integer.parseInt(householdAge);
                    answer.setHouseholdAge(householdAgeI);
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }

                String vdcMunicipality = vdcMunicipalityEt.getText().toString().trim();
                String wardNo = wardNumberEt.getText().toString().trim();
                String villageTole = villageToleEt.getText().toString().trim();

                answer.setVdcMunicipality(vdcMunicipality);
                answer.setWardNo(wardNo);
                answer.setVillageTole(villageTole);

                //ethnicity
                int ethnicity = ethnicityRg.getCheckedRadioButtonId();
                switch (ethnicity){
                    case R.id.ethnicity1Rb:
                        answer.setEthnicity(1);
                        break;
                    case R.id.ethnicity2Rb:
                        answer.setEthnicity(2);
                        break;
                    case R.id.ethnicity3Rb:
                        answer.setEthnicity(3);
                        break;
                    case R.id.ethnicity4Rb:
                        answer.setEthnicity(4);
                        break;
                    case R.id.ethnicity5Rb:
                        answer.setEthnicity(5);
                        break;
                }
                if(ethnicityOtherEt.isEnabled()){
                    answer.setOtherEthnicity(ethnicityOtherEt.getText().toString().trim());
                }

                int educationStatus = educationalRg.getCheckedRadioButtonId();
                switch(educationStatus){
                    case R.id.education0Rb:
                        answer.setEducationStatus(0);
                        break;
                    case R.id.education1Rb:
                        answer.setEducationStatus(1);
                        break;
                    case R.id.education2Rb:
                        answer.setEducationStatus(2);
                        break;
                    case R.id.education3Rb:
                        answer.setEducationStatus(3);
                        break;
                    case R.id.education4Rb:
                        answer.setEducationStatus(4);
                        break;
                    case R.id.education5Rb:
                        answer.setEducationStatus(5);
                        break;
                }

                //family size

                setEditTextToZero(familyMaleBelow6Et,familyFemaleBelow6Et,familyMale614Et,familyFemale614Et,familyMale1560Et,familyFemale1560Et,familyMaleAbove60Et,familyFemaleAbove60Et);

                String maleBelow6 = familyMaleBelow6Et.getText().toString().trim();
                String femaleBelow6 = familyFemaleBelow6Et.getText().toString().trim();
                String male614 = familyMale614Et.getText().toString().trim();
                String female614 = familyFemale614Et.getText().toString().trim();
                String male1560 = familyMale1560Et.getText().toString().trim();
                String female1560 = familyFemale1560Et.getText().toString().trim();
                String maleAbove60 = familyMaleAbove60Et.getText().toString().trim();
                String femaleAbove60 = familyFemaleAbove60Et.getText().toString().trim();


                try{
                    int maleBelow6I = Integer.parseInt(maleBelow6);
                    int femaleBelow6I = Integer.parseInt(femaleBelow6);
                    int male614I = Integer.parseInt(male614);
                    int female614I = Integer.parseInt(female614);
                    int male1560I = Integer.parseInt(male1560);
                    int female1560I = Integer.parseInt(female1560);
                    int maleAbove60I = Integer.parseInt(maleAbove60);
                    int femaleAbove60I = Integer.parseInt(femaleAbove60);

                    answer.setMaleBelow6(maleBelow6I);
                    answer.setFemaleBelow6(femaleBelow6I);
                    answer.setMale16_14(male614I);
                    answer.setFemale16_14(female614I);
                    answer.setMale15_60(male1560I);
                    answer.setFemale15_60(female1560I);
                    answer.setMaleAbove60(maleAbove60I);
                    answer.setFemaleAbove60(femaleAbove60I);

                }catch (NumberFormatException e){
                    e.printStackTrace();
                }

                int occupationMajor = majorOccupationRg.getCheckedRadioButtonId();
                switch(occupationMajor){
                    case R.id.occupation1Rb:
                        answer.setMajorOccupation(1);
                        break;
                    case R.id.occupation2Rb:
                        answer.setMajorOccupation(2);
                        break;
                    case R.id.occupation3Rb:
                        answer.setMajorOccupation(3);
                        break;
                    case R.id.occupation4Rb:
                        answer.setMajorOccupation(4);
                        break;
                    case R.id.occupation5Rb:
                        answer.setMajorOccupation(5);
                        break;
                    case R.id.occupation6Rb:
                        answer.setMajorOccupation(6);
                        break;
                }

                //Section B



                int cultivatedLandYesNo = cultivatedLandRg.getCheckedRadioButtonId();
                switch (cultivatedLandYesNo){
                    case R.id.cultivableLandYesRb:
                        answer.setHasCultivatedLand(1);
                        break;
                    case R.id.cultivableLandNoRb:
                        answer.setHasCultivatedLand(0);
                        break;
                }
                String totalCultivatedLand = totalCultivatedLandEt.getText().toString().trim();
                answer.setTotalCultivableLand(totalCultivatedLand);

                int landUnit = landUnitS.getSelectedItemPosition()+1;
                answer.setLandUnit(landUnit);

                int landOwnershipType = landOwnershipTypeS.getSelectedItemPosition()+1;
                answer.setLandOwnershipType(landOwnershipType);

                String yearRoundIrrigation = yearRoundIrrigationEt.getText().toString().trim();
                answer.setYearRoundIrrigation(yearRoundIrrigation);

                int informationSourceForTech = informationSourceForTechS.getSelectedItemPosition()+1;
                answer.setInformationSourceForTech(informationSourceForTech);

                int usefulInformationSource = usefulInformationSourceS.getSelectedItemPosition()+1;
                answer.setUsefulInformationSource(usefulInformationSource);

                String whySourceIsUseful = whySourceIsUsefulEt.getText().toString().trim();
                answer.setWhySourceIsUseful(whySourceIsUseful);



                Log.i("MainActivity", "Survey: "+answer.toString());

                break;
            case R.id.clearBtn:
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setEditTextToZero(EditText... ett){
        for(int i=0; i<ett.length; i++){
            if(ett[i].getText().toString().trim().equals("")){
                ett[i].setText("0");
            }
        }
    }

    @Override
    public void onBackPressed(){
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press Back button twice to exit!", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
