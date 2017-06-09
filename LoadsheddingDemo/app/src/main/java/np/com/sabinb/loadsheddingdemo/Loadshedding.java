package np.com.sabinb.loadsheddingdemo;

/**
 * Created by Sabin on 6/8/2015.
 */
public class Loadshedding {
    private int id;
    private int group;
    private String day;
    private String morningTime;
    private String eveningTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMorningTime() {
        return morningTime;
    }

    public void setMorningTime(String morningTime) {
        this.morningTime = morningTime;
    }

    public String getEveningTime() {
        return eveningTime;
    }

    public void setEveningTime(String eveningTime) {
        this.eveningTime = eveningTime;
    }
}
