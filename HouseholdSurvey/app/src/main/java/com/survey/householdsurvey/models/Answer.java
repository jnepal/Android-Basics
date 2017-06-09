package com.survey.householdsurvey.models;

import android.util.Log;

/**
 * Created by demo on 6/5/15.
 */
public class Answer {
    //identification
    private int district;
    private String responderName;
    private int responderSex;
    private int responderAge;
    private String householdHead;
    private int householdSex;
    private int householdAge;
    private String vdcMunicipality;
    private String wardNo;
    private String villageTole;
    private int ethnicity;
    private String otherEthnicity;
    private int educationStatus;
    //family size
    private int maleBelow6;
    private int femaleBelow6;
    private int male16_14;
    private int female16_14;
    private int male15_60;
    private int female15_60;
    private int maleAbove60;
    private int femaleAbove60;

    private int majorOccupation;
    private String otherOccupation;

    //farm characteristics
    private int hasCultivatedLand;
    private String totalCultivableLand;
    private int landUnit;
    private int landOwnershipType;
    private String yearRoundIrrigation;
    private int informationSourceForTech;
    private int usefulInformationSource;
    private String whySourceIsUseful;


    //radio
    private int radioWorkableAtHome;
    private int radioListenAgricultureProgram;
    private int radioListeningProgramFrequency;//17 (val 1,2,3,4,5)
    private int radioTimingOfAgricultureProgram;
    private String radioProgramsYouListenSunday;//19
    private int radioProgramsFrequencySunday;//19
    private String radioProgramsYouListenMonday;//19
    private int radioProgramsFrequencyMonday;//19
    private String radioProgramsYouListenTuesday;//19
    private int radioProgramsFrequencyTuesday;//19
    private String radioProgramsYouListenWednesday;//19
    private int radioProgramsFrequencyWednesday;//19
    private String radioProgramsYouListenThursday;//19
    private int radioProgramsFrequencyThursday;//19
    private String radioProgramsYouListenFriday;//19
    private int radioProgramsFrequencyFriday;//19
    private String radioProgramsYouListenSaturday;//19
    private int radioProgramsFrequencySaturday;//19
    private boolean radioSeedVarieties;//20
    private boolean radioLatestAgriTech;//20
    private boolean radioAccessToAgriLoan;//20
    private boolean radioPostHarvestMangt;//20
    private boolean radioDiseaseAndPestControl;//20
    private boolean radioSalesAndMarketing;//20
    private boolean radioFertilizerUse;//20
    private String radioOtherInfoReceived;//20
    private int radioDiscussWithFamily;
    private int radioServiceRating;
    private int radioContentRating;//23
    private int radioAdoptionInTech;//24
    private int radioRelevant;//25
    private int radioFmAgricultureProgram;
    private int radioLanguageClarity;//27
    private int radioProgramTiming;
    private int radioProgramTimePreference;//29
    private int radioNotListeningProgramWhy;
    private int radioRevisingProgram;
    private String radioImprovementTips;//32

    //television
    private int tvWorkableAtHome;//31
    private int tvWatchOften;
    private String tvProgramWatchMostly;
    private int tvAgricultureProgramWatch;
    private int tvTimingOfAgricultureProgram;//35

    private String tvProgramsYouListenSunday;//36
    private int tvProgramsFrequencySunday;//36
    private String tvProgramsYouListenMonday;//36
    private int tvProgramsFrequencyMonday;//36
    private String tvProgramsYouListenTuesday;//36
    private int tvProgramsFrequencyTuesday;//36
    private String tvProgramsYouListenWednesday;//36
    private int tvProgramsFrequencyWednesday;//36
    private String tvProgramsYouListenThursday;//36
    private int tvProgramsFrequencyThursday;//36
    private String tvProgramsYouListenFriday;//36
    private int tvProgramsFrequencyFriday;//36
    private String tvProgramsYouListenSaturday;//36
    private int tvProgramsFrequencySaturday;//36
    private boolean tvSeedVarieties;//37
    private boolean tvLatestAgriTech;//37
    private boolean tvAccessToAgriLoan;//37
    private boolean tvPostHarvestMangt;//37
    private boolean tvDiseaseAndPestControl;//37
    private boolean tvSalesAndMarketing;//37
    private boolean tvFertilizerUse;//37
    private String tvOtherInfoReceived;//37

    private int tvDiscussWithFamily;//38
    private int tvServiceRating;//39
    private int tvContentRating;//40
    private int tvAdoptionInTech;//41
    private int tvRelevant;//43
    private int tvRegionalAgricultureProgram;//44
    private int tvLanguageClarity;//45
    private int tvProgramTiming;//46
    private String tvWhyTimingNotAppropriate;//47
    private int tvProgramTimePreference;//48
    private int tvProgramDurationSufficient;//49
    private int tvSuitableProgramDuration;//50
    private String tvWhyNoWatchingProgram;//51
    private int tvReviseAgriculturalProgram;//52
    private String tvImprovementsTips;//53

    //printed Materials
    private int pmPublicationFromAicc;//54
    private int pmReadBookletMagazine;//55
    private int pmExtentOfReading;//56
    private int pmMaterialReceivedFrom;//57
    private boolean pmMostlyReadBooklets;//58
    private boolean pmMostlyReadLeaflets;//58
    private boolean pmMostlyReadBimonthlyMagazine;//58
    private boolean pmMostlyReadCalendar;//58
    private boolean pmMostlyReadAgricultureDiary;//58
    private boolean pmMostlyReadOtherMaterials;//58
    private int pmReadHowOften;//59
    private boolean pmSeedVarieties;//60
    private boolean pmLatestAgriTech;//60
    private boolean pmAccessToAgriLoan;//60
    private boolean pmPostHarvestMangt;//60
    private boolean pmDiseaseAndPestControl;//60
    private boolean pmSalesAndMarketing;//60
    private boolean pmFertilizerUse;//60
    private String pmOtherInfoReceived;//60


    private int pmDiscussWithFamily;//61
    private int pmServiceRating;//62
    private int pmContentRating;//63
    private int pmAdoptionInTech;//64
    private int pmRelevant;//65
    private int pmTryingNewTech;//66
    private int pmRegionalAgricultureProgram;//67
    private int pmLanguageAndContentAppropriate;//68
    private String pmWhyTimingNotAppropriate;//69
    private int pmProgramTimePreference;//70
    private int pmTimingOfPublicationSuitable;//71
    private String pmWhyNoReadProgram;//72
    private int pmReviseAgriculturalProgram;//73
    private String pmImprovementsTips;//74


    //framework condition and others
    private int attendingMeetingsOnAgri;//75
    private int attendingMeetingTimes;//75
    private int askQuestionAboutFramingTo;//76
    private String askQuestionAboutFramingToOther;
    private char decisionTakingSex;
    private String anySuggestionComments;


    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getResponderName() {
        return responderName;
    }

    public void setResponderName(String responderName) {
        this.responderName = responderName;
    }

    public int getResponderSex() {
        return responderSex;
    }

    public void setResponderSex(int responderSex) {
        this.responderSex = responderSex;
    }

    public int getResponderAge() {
        return responderAge;
    }

    public void setResponderAge(int responderAge) {
        this.responderAge = responderAge;
    }

    public String getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(String householdHead) {
        this.householdHead = householdHead;
    }

    public int getHouseholdSex() {
        return householdSex;
    }

    public void setHouseholdSex(int householdSex) {
        this.householdSex = householdSex;
    }

    public int getHouseholdAge() {
        return householdAge;
    }

    public void setHouseholdAge(int householdAge) {
        this.householdAge = householdAge;
    }

    public String getVdcMunicipality() {
        return vdcMunicipality;
    }

    public void setVdcMunicipality(String vdcMunicipality) {
        this.vdcMunicipality = vdcMunicipality;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getVillageTole() {
        return villageTole;
    }

    public void setVillageTole(String villageTole) {
        this.villageTole = villageTole;
    }

    public int getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(int ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getOtherEthnicity() {
        return otherEthnicity;
    }

    public void setOtherEthnicity(String otherEthnicity) {
        this.otherEthnicity = otherEthnicity;
    }

    public int getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(int educationStatus) {
        this.educationStatus = educationStatus;
    }

    public int getMaleBelow6() {
        return maleBelow6;
    }

    public void setMaleBelow6(int maleBelow6) {
        this.maleBelow6 = maleBelow6;
    }

    public int getFemaleBelow6() {
        return femaleBelow6;
    }

    public void setFemaleBelow6(int femaleBelow6) {
        this.femaleBelow6 = femaleBelow6;
    }

    public int getMale16_14() {
        return male16_14;
    }

    public void setMale16_14(int male16_14) {
        this.male16_14 = male16_14;
    }

    public int getFemale16_14() {
        return female16_14;
    }

    public void setFemale16_14(int female16_14) {
        this.female16_14 = female16_14;
    }

    public int getMale15_60() {
        return male15_60;
    }

    public void setMale15_60(int male15_60) {
        this.male15_60 = male15_60;
    }

    public int getFemale15_60() {
        return female15_60;
    }

    public void setFemale15_60(int female15_60) {
        this.female15_60 = female15_60;
    }

    public int getMaleAbove60() {
        return maleAbove60;
    }

    public void setMaleAbove60(int maleAbove60) {
        this.maleAbove60 = maleAbove60;
    }

    public int getFemaleAbove60() {
        return femaleAbove60;
    }

    public void setFemaleAbove60(int femaleAbove60) {
        this.femaleAbove60 = femaleAbove60;
    }

    public int getMajorOccupation() {
        return majorOccupation;
    }

    public void setMajorOccupation(int majorOccupation) {
        this.majorOccupation = majorOccupation;
    }

    public String getOtherOccupation() {
        return otherOccupation;
    }

    public void setOtherOccupation(String otherOccupation) {
        this.otherOccupation = otherOccupation;
    }

    public int getHasCultivatedLand() {
        return hasCultivatedLand;
    }

    public void setHasCultivatedLand(int hasCultivatedLand) {
        this.hasCultivatedLand = hasCultivatedLand;
    }

    public String getTotalCultivableLand() {
        return totalCultivableLand;
    }

    public void setTotalCultivableLand(String totalCultivableLand) {
        this.totalCultivableLand = totalCultivableLand;
    }

    public int getLandOwnershipType() {
        return landOwnershipType;
    }

    public void setLandOwnershipType(int landOwnershipType) {
        this.landOwnershipType = landOwnershipType;
    }

    public String getYearRoundIrrigation() {
        return yearRoundIrrigation;
    }

    public void setYearRoundIrrigation(String yearRoundIrrigation) {
        this.yearRoundIrrigation = yearRoundIrrigation;
    }

    public int getInformationSourceForTech() {
        return informationSourceForTech;
    }

    public void setInformationSourceForTech(int informationSourceForTech) {
        this.informationSourceForTech = informationSourceForTech;
    }

    public int getUsefulInformationSource() {
        return usefulInformationSource;
    }

    public void setUsefulInformationSource(int usefulInformationSource) {
        this.usefulInformationSource = usefulInformationSource;
    }

    public String getWhySourceIsUseful() {
        return whySourceIsUseful;
    }

    public void setWhySourceIsUseful(String whySourceIsUseful) {
        this.whySourceIsUseful = whySourceIsUseful;
    }

    public int getRadioWorkableAtHome() {
        return radioWorkableAtHome;
    }

    public void setRadioWorkableAtHome(int radioWorkableAtHome) {
        this.radioWorkableAtHome = radioWorkableAtHome;
    }

    public int getRadioListenAgricultureProgram() {
        return radioListenAgricultureProgram;
    }

    public void setRadioListenAgricultureProgram(int radioListenAgricultureProgram) {
        this.radioListenAgricultureProgram = radioListenAgricultureProgram;
    }

    public int getRadioListeningProgramFrequency() {
        return radioListeningProgramFrequency;
    }

    public void setRadioListeningProgramFrequency(int radioListeningProgramFrequency) {
        this.radioListeningProgramFrequency = radioListeningProgramFrequency;
    }

    public int getRadioTimingOfAgricultureProgram() {
        return radioTimingOfAgricultureProgram;
    }

    public void setRadioTimingOfAgricultureProgram(int radioTimingOfAgricultureProgram) {
        this.radioTimingOfAgricultureProgram = radioTimingOfAgricultureProgram;
    }

    public String getRadioProgramsYouListenSunday() {
        return radioProgramsYouListenSunday;
    }

    public void setRadioProgramsYouListenSunday(String radioProgramsYouListenSunday) {
        this.radioProgramsYouListenSunday = radioProgramsYouListenSunday;
    }

    public int getRadioProgramsFrequencySunday() {
        return radioProgramsFrequencySunday;
    }

    public void setRadioProgramsFrequencySunday(int radioProgramsFrequencySunday) {
        this.radioProgramsFrequencySunday = radioProgramsFrequencySunday;
    }

    public String getRadioProgramsYouListenMonday() {
        return radioProgramsYouListenMonday;
    }

    public void setRadioProgramsYouListenMonday(String radioProgramsYouListenMonday) {
        this.radioProgramsYouListenMonday = radioProgramsYouListenMonday;
    }

    public int getRadioProgramsFrequencyMonday() {
        return radioProgramsFrequencyMonday;
    }

    public void setRadioProgramsFrequencyMonday(int radioProgramsFrequencyMonday) {
        this.radioProgramsFrequencyMonday = radioProgramsFrequencyMonday;
    }

    public String getRadioProgramsYouListenTuesday() {
        return radioProgramsYouListenTuesday;
    }

    public void setRadioProgramsYouListenTuesday(String radioProgramsYouListenTuesday) {
        this.radioProgramsYouListenTuesday = radioProgramsYouListenTuesday;
    }

    public int getRadioProgramsFrequencyTuesday() {
        return radioProgramsFrequencyTuesday;
    }

    public void setRadioProgramsFrequencyTuesday(int radioProgramsFrequencyTuesday) {
        this.radioProgramsFrequencyTuesday = radioProgramsFrequencyTuesday;
    }

    public String getRadioProgramsYouListenWednesday() {
        return radioProgramsYouListenWednesday;
    }

    public void setRadioProgramsYouListenWednesday(String radioProgramsYouListenWednesday) {
        this.radioProgramsYouListenWednesday = radioProgramsYouListenWednesday;
    }

    public int getRadioProgramsFrequencyWednesday() {
        return radioProgramsFrequencyWednesday;
    }

    public void setRadioProgramsFrequencyWednesday(int radioProgramsFrequencyWednesday) {
        this.radioProgramsFrequencyWednesday = radioProgramsFrequencyWednesday;
    }

    public String getRadioProgramsYouListenThursday() {
        return radioProgramsYouListenThursday;
    }

    public void setRadioProgramsYouListenThursday(String radioProgramsYouListenThursday) {
        this.radioProgramsYouListenThursday = radioProgramsYouListenThursday;
    }

    public int getRadioProgramsFrequencyThursday() {
        return radioProgramsFrequencyThursday;
    }

    public void setRadioProgramsFrequencyThursday(int radioProgramsFrequencyThursday) {
        this.radioProgramsFrequencyThursday = radioProgramsFrequencyThursday;
    }

    public String getRadioProgramsYouListenFriday() {
        return radioProgramsYouListenFriday;
    }

    public void setRadioProgramsYouListenFriday(String radioProgramsYouListenFriday) {
        this.radioProgramsYouListenFriday = radioProgramsYouListenFriday;
    }

    public int getRadioProgramsFrequencyFriday() {
        return radioProgramsFrequencyFriday;
    }

    public void setRadioProgramsFrequencyFriday(int radioProgramsFrequencyFriday) {
        this.radioProgramsFrequencyFriday = radioProgramsFrequencyFriday;
    }

    public String getRadioProgramsYouListenSaturday() {
        return radioProgramsYouListenSaturday;
    }

    public void setRadioProgramsYouListenSaturday(String radioProgramsYouListenSaturday) {
        this.radioProgramsYouListenSaturday = radioProgramsYouListenSaturday;
    }

    public int getRadioProgramsFrequencySaturday() {
        return radioProgramsFrequencySaturday;
    }

    public void setRadioProgramsFrequencySaturday(int radioProgramsFrequencySaturday) {
        this.radioProgramsFrequencySaturday = radioProgramsFrequencySaturday;
    }

    public boolean isRadioSeedVarieties() {
        return radioSeedVarieties;
    }

    public void setRadioSeedVarieties(boolean radioSeedVarieties) {
        this.radioSeedVarieties = radioSeedVarieties;
    }

    public boolean isRadioLatestAgriTech() {
        return radioLatestAgriTech;
    }

    public void setRadioLatestAgriTech(boolean radioLatestAgriTech) {
        this.radioLatestAgriTech = radioLatestAgriTech;
    }

    public boolean isRadioAccessToAgriLoan() {
        return radioAccessToAgriLoan;
    }

    public void setRadioAccessToAgriLoan(boolean radioAccessToAgriLoan) {
        this.radioAccessToAgriLoan = radioAccessToAgriLoan;
    }

    public boolean isRadioPostHarvestMangt() {
        return radioPostHarvestMangt;
    }

    public void setRadioPostHarvestMangt(boolean radioPostHarvestMangt) {
        this.radioPostHarvestMangt = radioPostHarvestMangt;
    }

    public boolean isRadioDiseaseAndPestControl() {
        return radioDiseaseAndPestControl;
    }

    public void setRadioDiseaseAndPestControl(boolean radioDiseaseAndPestControl) {
        this.radioDiseaseAndPestControl = radioDiseaseAndPestControl;
    }

    public boolean isRadioSalesAndMarketing() {
        return radioSalesAndMarketing;
    }

    public void setRadioSalesAndMarketing(boolean radioSalesAndMarketing) {
        this.radioSalesAndMarketing = radioSalesAndMarketing;
    }

    public boolean isRadioFertilizerUse() {
        return radioFertilizerUse;
    }

    public void setRadioFertilizerUse(boolean radioFertilizerUse) {
        this.radioFertilizerUse = radioFertilizerUse;
    }

    public String getRadioOtherInfoReceived() {
        return radioOtherInfoReceived;
    }

    public void setRadioOtherInfoReceived(String radioOtherInfoReceived) {
        this.radioOtherInfoReceived = radioOtherInfoReceived;
    }

    public int getRadioDiscussWithFamily() {
        return radioDiscussWithFamily;
    }

    public void setRadioDiscussWithFamily(int radioDiscussWithFamily) {
        this.radioDiscussWithFamily = radioDiscussWithFamily;
    }

    public int getRadioServiceRating() {
        return radioServiceRating;
    }

    public void setRadioServiceRating(int radioServiceRating) {
        this.radioServiceRating = radioServiceRating;
    }

    public int getRadioContentRating() {
        return radioContentRating;
    }

    public void setRadioContentRating(int radioContentRating) {
        this.radioContentRating = radioContentRating;
    }

    public int getRadioAdoptionInTech() {
        return radioAdoptionInTech;
    }

    public void setRadioAdoptionInTech(int radioAdoptionInTech) {
        this.radioAdoptionInTech = radioAdoptionInTech;
    }

    public int getRadioRelevant() {
        return radioRelevant;
    }

    public void setRadioRelevant(int radioRelevant) {
        this.radioRelevant = radioRelevant;
    }

    public int getRadioFmAgricultureProgram() {
        return radioFmAgricultureProgram;
    }

    public void setRadioFmAgricultureProgram(int radioFmAgricultureProgram) {
        this.radioFmAgricultureProgram = radioFmAgricultureProgram;
    }

    public int getRadioLanguageClarity() {
        return radioLanguageClarity;
    }

    public void setRadioLanguageClarity(int radioLanguageClarity) {
        this.radioLanguageClarity = radioLanguageClarity;
    }

    public int getRadioProgramTiming() {
        return radioProgramTiming;
    }

    public void setRadioProgramTiming(int radioProgramTiming) {
        this.radioProgramTiming = radioProgramTiming;
    }

    public int getRadioProgramTimePreference() {
        return radioProgramTimePreference;
    }

    public void setRadioProgramTimePreference(int radioProgramTimePreference) {
        this.radioProgramTimePreference = radioProgramTimePreference;
    }

    public int getRadioNotListeningProgramWhy() {
        return radioNotListeningProgramWhy;
    }

    public void setRadioNotListeningProgramWhy(int radioNotListeningProgramWhy) {
        this.radioNotListeningProgramWhy = radioNotListeningProgramWhy;
    }

    public int getRadioRevisingProgram() {
        return radioRevisingProgram;
    }

    public void setRadioRevisingProgram(int radioRevisingProgram) {
        this.radioRevisingProgram = radioRevisingProgram;
    }

    public String getRadioImprovementTips() {
        return radioImprovementTips;
    }

    public void setRadioImprovementTips(String radioImprovementTips) {
        this.radioImprovementTips = radioImprovementTips;
    }

    public int getTvWorkableAtHome() {
        return tvWorkableAtHome;
    }

    public void setTvWorkableAtHome(int tvWorkableAtHome) {
        this.tvWorkableAtHome = tvWorkableAtHome;
    }

    public int getTvWatchOften() {
        return tvWatchOften;
    }

    public void setTvWatchOften(int tvWatchOften) {
        this.tvWatchOften = tvWatchOften;
    }

    public String getTvProgramWatchMostly() {
        return tvProgramWatchMostly;
    }

    public void setTvProgramWatchMostly(String tvProgramWatchMostly) {
        this.tvProgramWatchMostly = tvProgramWatchMostly;
    }

    public int getTvAgricultureProgramWatch() {
        return tvAgricultureProgramWatch;
    }

    public void setTvAgricultureProgramWatch(int tvAgricultureProgramWatch) {
        this.tvAgricultureProgramWatch = tvAgricultureProgramWatch;
    }

    public int getTvTimingOfAgricultureProgram() {
        return tvTimingOfAgricultureProgram;
    }

    public void setTvTimingOfAgricultureProgram(int tvTimingOfAgricultureProgram) {
        this.tvTimingOfAgricultureProgram = tvTimingOfAgricultureProgram;
    }

    public String getTvProgramsYouListenSunday() {
        return tvProgramsYouListenSunday;
    }

    public void setTvProgramsYouListenSunday(String tvProgramsYouListenSunday) {
        this.tvProgramsYouListenSunday = tvProgramsYouListenSunday;
    }

    public int getTvProgramsFrequencySunday() {
        return tvProgramsFrequencySunday;
    }

    public void setTvProgramsFrequencySunday(int tvProgramsFrequencySunday) {
        this.tvProgramsFrequencySunday = tvProgramsFrequencySunday;
    }

    public String getTvProgramsYouListenMonday() {
        return tvProgramsYouListenMonday;
    }

    public void setTvProgramsYouListenMonday(String tvProgramsYouListenMonday) {
        this.tvProgramsYouListenMonday = tvProgramsYouListenMonday;
    }

    public int getTvProgramsFrequencyMonday() {
        return tvProgramsFrequencyMonday;
    }

    public void setTvProgramsFrequencyMonday(int tvProgramsFrequencyMonday) {
        this.tvProgramsFrequencyMonday = tvProgramsFrequencyMonday;
    }

    public String getTvProgramsYouListenTuesday() {
        return tvProgramsYouListenTuesday;
    }

    public void setTvProgramsYouListenTuesday(String tvProgramsYouListenTuesday) {
        this.tvProgramsYouListenTuesday = tvProgramsYouListenTuesday;
    }

    public int getTvProgramsFrequencyTuesday() {
        return tvProgramsFrequencyTuesday;
    }

    public void setTvProgramsFrequencyTuesday(int tvProgramsFrequencyTuesday) {
        this.tvProgramsFrequencyTuesday = tvProgramsFrequencyTuesday;
    }

    public String getTvProgramsYouListenWednesday() {
        return tvProgramsYouListenWednesday;
    }

    public void setTvProgramsYouListenWednesday(String tvProgramsYouListenWednesday) {
        this.tvProgramsYouListenWednesday = tvProgramsYouListenWednesday;
    }

    public int getTvProgramsFrequencyWednesday() {
        return tvProgramsFrequencyWednesday;
    }

    public void setTvProgramsFrequencyWednesday(int tvProgramsFrequencyWednesday) {
        this.tvProgramsFrequencyWednesday = tvProgramsFrequencyWednesday;
    }

    public String getTvProgramsYouListenThursday() {
        return tvProgramsYouListenThursday;
    }

    public void setTvProgramsYouListenThursday(String tvProgramsYouListenThursday) {
        this.tvProgramsYouListenThursday = tvProgramsYouListenThursday;
    }

    public int getTvProgramsFrequencyThursday() {
        return tvProgramsFrequencyThursday;
    }

    public void setTvProgramsFrequencyThursday(int tvProgramsFrequencyThursday) {
        this.tvProgramsFrequencyThursday = tvProgramsFrequencyThursday;
    }

    public String getTvProgramsYouListenFriday() {
        return tvProgramsYouListenFriday;
    }

    public void setTvProgramsYouListenFriday(String tvProgramsYouListenFriday) {
        this.tvProgramsYouListenFriday = tvProgramsYouListenFriday;
    }

    public int getTvProgramsFrequencyFriday() {
        return tvProgramsFrequencyFriday;
    }

    public void setTvProgramsFrequencyFriday(int tvProgramsFrequencyFriday) {
        this.tvProgramsFrequencyFriday = tvProgramsFrequencyFriday;
    }

    public String getTvProgramsYouListenSaturday() {
        return tvProgramsYouListenSaturday;
    }

    public void setTvProgramsYouListenSaturday(String tvProgramsYouListenSaturday) {
        this.tvProgramsYouListenSaturday = tvProgramsYouListenSaturday;
    }

    public int getTvProgramsFrequencySaturday() {
        return tvProgramsFrequencySaturday;
    }

    public void setTvProgramsFrequencySaturday(int tvProgramsFrequencySaturday) {
        this.tvProgramsFrequencySaturday = tvProgramsFrequencySaturday;
    }

    public boolean isTvSeedVarieties() {
        return tvSeedVarieties;
    }

    public void setTvSeedVarieties(boolean tvSeedVarieties) {
        this.tvSeedVarieties = tvSeedVarieties;
    }

    public boolean isTvLatestAgriTech() {
        return tvLatestAgriTech;
    }

    public void setTvLatestAgriTech(boolean tvLatestAgriTech) {
        this.tvLatestAgriTech = tvLatestAgriTech;
    }

    public boolean isTvAccessToAgriLoan() {
        return tvAccessToAgriLoan;
    }

    public void setTvAccessToAgriLoan(boolean tvAccessToAgriLoan) {
        this.tvAccessToAgriLoan = tvAccessToAgriLoan;
    }

    public boolean isTvPostHarvestMangt() {
        return tvPostHarvestMangt;
    }

    public void setTvPostHarvestMangt(boolean tvPostHarvestMangt) {
        this.tvPostHarvestMangt = tvPostHarvestMangt;
    }

    public boolean isTvDiseaseAndPestControl() {
        return tvDiseaseAndPestControl;
    }

    public void setTvDiseaseAndPestControl(boolean tvDiseaseAndPestControl) {
        this.tvDiseaseAndPestControl = tvDiseaseAndPestControl;
    }

    public boolean isTvSalesAndMarketing() {
        return tvSalesAndMarketing;
    }

    public void setTvSalesAndMarketing(boolean tvSalesAndMarketing) {
        this.tvSalesAndMarketing = tvSalesAndMarketing;
    }

    public boolean isTvFertilizerUse() {
        return tvFertilizerUse;
    }

    public void setTvFertilizerUse(boolean tvFertilizerUse) {
        this.tvFertilizerUse = tvFertilizerUse;
    }

    public String getTvOtherInfoReceived() {
        return tvOtherInfoReceived;
    }

    public void setTvOtherInfoReceived(String tvOtherInfoReceived) {
        this.tvOtherInfoReceived = tvOtherInfoReceived;
    }

    public int getTvDiscussWithFamily() {
        return tvDiscussWithFamily;
    }

    public void setTvDiscussWithFamily(int tvDiscussWithFamily) {
        this.tvDiscussWithFamily = tvDiscussWithFamily;
    }

    public int getTvServiceRating() {
        return tvServiceRating;
    }

    public void setTvServiceRating(int tvServiceRating) {
        this.tvServiceRating = tvServiceRating;
    }

    public int getTvContentRating() {
        return tvContentRating;
    }

    public void setTvContentRating(int tvContentRating) {
        this.tvContentRating = tvContentRating;
    }

    public int getTvAdoptionInTech() {
        return tvAdoptionInTech;
    }

    public void setTvAdoptionInTech(int tvAdoptionInTech) {
        this.tvAdoptionInTech = tvAdoptionInTech;
    }

    public int getTvRelevant() {
        return tvRelevant;
    }

    public void setTvRelevant(int tvRelevant) {
        this.tvRelevant = tvRelevant;
    }

    public int getTvRegionalAgricultureProgram() {
        return tvRegionalAgricultureProgram;
    }

    public void setTvRegionalAgricultureProgram(int tvRegionalAgricultureProgram) {
        this.tvRegionalAgricultureProgram = tvRegionalAgricultureProgram;
    }

    public int getTvLanguageClarity() {
        return tvLanguageClarity;
    }

    public void setTvLanguageClarity(int tvLanguageClarity) {
        this.tvLanguageClarity = tvLanguageClarity;
    }

    public int getTvProgramTiming() {
        return tvProgramTiming;
    }

    public void setTvProgramTiming(int tvProgramTiming) {
        this.tvProgramTiming = tvProgramTiming;
    }

    public String getTvWhyTimingNotAppropriate() {
        return tvWhyTimingNotAppropriate;
    }

    public void setTvWhyTimingNotAppropriate(String tvWhyTimingNotAppropriate) {
        this.tvWhyTimingNotAppropriate = tvWhyTimingNotAppropriate;
    }

    public int getTvProgramTimePreference() {
        return tvProgramTimePreference;
    }

    public void setTvProgramTimePreference(int tvProgramTimePreference) {
        this.tvProgramTimePreference = tvProgramTimePreference;
    }

    public int getTvProgramDurationSufficient() {
        return tvProgramDurationSufficient;
    }

    public void setTvProgramDurationSufficient(int tvProgramDurationSufficient) {
        this.tvProgramDurationSufficient = tvProgramDurationSufficient;
    }

    public int getTvSuitableProgramDuration() {
        return tvSuitableProgramDuration;
    }

    public void setTvSuitableProgramDuration(int tvSuitableProgramDuration) {
        this.tvSuitableProgramDuration = tvSuitableProgramDuration;
    }

    public String getTvWhyNoWatchingProgram() {
        return tvWhyNoWatchingProgram;
    }

    public void setTvWhyNoWatchingProgram(String tvWhyNoWatchingProgram) {
        this.tvWhyNoWatchingProgram = tvWhyNoWatchingProgram;
    }

    public int getTvReviseAgriculturalProgram() {
        return tvReviseAgriculturalProgram;
    }

    public void setTvReviseAgriculturalProgram(int tvReviseAgriculturalProgram) {
        this.tvReviseAgriculturalProgram = tvReviseAgriculturalProgram;
    }

    public String getTvImprovementsTips() {
        return tvImprovementsTips;
    }

    public void setTvImprovementsTips(String tvImprovementsTips) {
        this.tvImprovementsTips = tvImprovementsTips;
    }

    public int getPmPublicationFromAicc() {
        return pmPublicationFromAicc;
    }

    public void setPmPublicationFromAicc(int pmPublicationFromAicc) {
        this.pmPublicationFromAicc = pmPublicationFromAicc;
    }

    public int getPmReadBookletMagazine() {
        return pmReadBookletMagazine;
    }

    public void setPmReadBookletMagazine(int pmReadBookletMagazine) {
        this.pmReadBookletMagazine = pmReadBookletMagazine;
    }

    public int getPmExtentOfReading() {
        return pmExtentOfReading;
    }

    public void setPmExtentOfReading(int pmExtentOfReading) {
        this.pmExtentOfReading = pmExtentOfReading;
    }

    public int getPmMaterialReceivedFrom() {
        return pmMaterialReceivedFrom;
    }

    public void setPmMaterialReceivedFrom(int pmMaterialReceivedFrom) {
        this.pmMaterialReceivedFrom = pmMaterialReceivedFrom;
    }

    public boolean isPmMostlyReadBooklets() {
        return pmMostlyReadBooklets;
    }

    public void setPmMostlyReadBooklets(boolean pmMostlyReadBooklets) {
        this.pmMostlyReadBooklets = pmMostlyReadBooklets;
    }

    public boolean isPmMostlyReadLeaflets() {
        return pmMostlyReadLeaflets;
    }

    public void setPmMostlyReadLeaflets(boolean pmMostlyReadLeaflets) {
        this.pmMostlyReadLeaflets = pmMostlyReadLeaflets;
    }

    public boolean isPmMostlyReadBimonthlyMagazine() {
        return pmMostlyReadBimonthlyMagazine;
    }

    public void setPmMostlyReadBimonthlyMagazine(boolean pmMostlyReadBimonthlyMagazine) {
        this.pmMostlyReadBimonthlyMagazine = pmMostlyReadBimonthlyMagazine;
    }

    public boolean isPmMostlyReadCalendar() {
        return pmMostlyReadCalendar;
    }

    public void setPmMostlyReadCalendar(boolean pmMostlyReadCalendar) {
        this.pmMostlyReadCalendar = pmMostlyReadCalendar;
    }

    public boolean isPmMostlyReadAgricultureDiary() {
        return pmMostlyReadAgricultureDiary;
    }

    public void setPmMostlyReadAgricultureDiary(boolean pmMostlyReadAgricultureDiary) {
        this.pmMostlyReadAgricultureDiary = pmMostlyReadAgricultureDiary;
    }

    public boolean isPmMostlyReadOtherMaterials() {
        return pmMostlyReadOtherMaterials;
    }

    public void setPmMostlyReadOtherMaterials(boolean pmMostlyReadOtherMaterials) {
        this.pmMostlyReadOtherMaterials = pmMostlyReadOtherMaterials;
    }

    public int getPmReadHowOften() {
        return pmReadHowOften;
    }

    public void setPmReadHowOften(int pmReadHowOften) {
        this.pmReadHowOften = pmReadHowOften;
    }

    public boolean isPmSeedVarieties() {
        return pmSeedVarieties;
    }

    public void setPmSeedVarieties(boolean pmSeedVarieties) {
        this.pmSeedVarieties = pmSeedVarieties;
    }

    public boolean isPmLatestAgriTech() {
        return pmLatestAgriTech;
    }

    public void setPmLatestAgriTech(boolean pmLatestAgriTech) {
        this.pmLatestAgriTech = pmLatestAgriTech;
    }

    public boolean isPmAccessToAgriLoan() {
        return pmAccessToAgriLoan;
    }

    public void setPmAccessToAgriLoan(boolean pmAccessToAgriLoan) {
        this.pmAccessToAgriLoan = pmAccessToAgriLoan;
    }

    public boolean isPmPostHarvestMangt() {
        return pmPostHarvestMangt;
    }

    public void setPmPostHarvestMangt(boolean pmPostHarvestMangt) {
        this.pmPostHarvestMangt = pmPostHarvestMangt;
    }

    public boolean isPmDiseaseAndPestControl() {
        return pmDiseaseAndPestControl;
    }

    public void setPmDiseaseAndPestControl(boolean pmDiseaseAndPestControl) {
        this.pmDiseaseAndPestControl = pmDiseaseAndPestControl;
    }

    public boolean isPmSalesAndMarketing() {
        return pmSalesAndMarketing;
    }

    public void setPmSalesAndMarketing(boolean pmSalesAndMarketing) {
        this.pmSalesAndMarketing = pmSalesAndMarketing;
    }

    public boolean isPmFertilizerUse() {
        return pmFertilizerUse;
    }

    public void setPmFertilizerUse(boolean pmFertilizerUse) {
        this.pmFertilizerUse = pmFertilizerUse;
    }

    public String getPmOtherInfoReceived() {
        return pmOtherInfoReceived;
    }

    public void setPmOtherInfoReceived(String pmOtherInfoReceived) {
        this.pmOtherInfoReceived = pmOtherInfoReceived;
    }

    public int getPmDiscussWithFamily() {
        return pmDiscussWithFamily;
    }

    public void setPmDiscussWithFamily(int pmDiscussWithFamily) {
        this.pmDiscussWithFamily = pmDiscussWithFamily;
    }

    public int getPmServiceRating() {
        return pmServiceRating;
    }

    public void setPmServiceRating(int pmServiceRating) {
        this.pmServiceRating = pmServiceRating;
    }

    public int getPmContentRating() {
        return pmContentRating;
    }

    public void setPmContentRating(int pmContentRating) {
        this.pmContentRating = pmContentRating;
    }

    public int getPmAdoptionInTech() {
        return pmAdoptionInTech;
    }

    public void setPmAdoptionInTech(int pmAdoptionInTech) {
        this.pmAdoptionInTech = pmAdoptionInTech;
    }

    public int getPmRelevant() {
        return pmRelevant;
    }

    public void setPmRelevant(int pmRelevant) {
        this.pmRelevant = pmRelevant;
    }

    public int getPmTryingNewTech() {
        return pmTryingNewTech;
    }

    public void setPmTryingNewTech(int pmTryingNewTech) {
        this.pmTryingNewTech = pmTryingNewTech;
    }

    public int getPmRegionalAgricultureProgram() {
        return pmRegionalAgricultureProgram;
    }

    public void setPmRegionalAgricultureProgram(int pmRegionalAgricultureProgram) {
        this.pmRegionalAgricultureProgram = pmRegionalAgricultureProgram;
    }

    public int getPmLanguageAndContentAppropriate() {
        return pmLanguageAndContentAppropriate;
    }

    public void setPmLanguageAndContentAppropriate(int pmLanguageAndContentAppropriate) {
        this.pmLanguageAndContentAppropriate = pmLanguageAndContentAppropriate;
    }

    public String getPmWhyTimingNotAppropriate() {
        return pmWhyTimingNotAppropriate;
    }

    public void setPmWhyTimingNotAppropriate(String pmWhyTimingNotAppropriate) {
        this.pmWhyTimingNotAppropriate = pmWhyTimingNotAppropriate;
    }

    public int getPmProgramTimePreference() {
        return pmProgramTimePreference;
    }

    public void setPmProgramTimePreference(int pmProgramTimePreference) {
        this.pmProgramTimePreference = pmProgramTimePreference;
    }

    public int getPmTimingOfPublicationSuitable() {
        return pmTimingOfPublicationSuitable;
    }

    public void setPmTimingOfPublicationSuitable(int pmTimingOfPublicationSuitable) {
        this.pmTimingOfPublicationSuitable = pmTimingOfPublicationSuitable;
    }

    public String getPmWhyNoReadProgram() {
        return pmWhyNoReadProgram;
    }

    public void setPmWhyNoReadProgram(String pmWhyNoReadProgram) {
        this.pmWhyNoReadProgram = pmWhyNoReadProgram;
    }

    public int getPmReviseAgriculturalProgram() {
        return pmReviseAgriculturalProgram;
    }

    public void setPmReviseAgriculturalProgram(int pmReviseAgriculturalProgram) {
        this.pmReviseAgriculturalProgram = pmReviseAgriculturalProgram;
    }

    public String getPmImprovementsTips() {
        return pmImprovementsTips;
    }

    public void setPmImprovementsTips(String pmImprovementsTips) {
        this.pmImprovementsTips = pmImprovementsTips;
    }

    public int getAttendingMeetingsOnAgri() {
        return attendingMeetingsOnAgri;
    }

    public void setAttendingMeetingsOnAgri(int attendingMeetingsOnAgri) {
        this.attendingMeetingsOnAgri = attendingMeetingsOnAgri;
    }

    public int getAttendingMeetingTimes() {
        return attendingMeetingTimes;
    }

    public void setAttendingMeetingTimes(int attendingMeetingTimes) {
        this.attendingMeetingTimes = attendingMeetingTimes;
    }

    public int getAskQuestionAboutFramingTo() {
        return askQuestionAboutFramingTo;
    }

    public void setAskQuestionAboutFramingTo(int askQuestionAboutFramingTo) {
        this.askQuestionAboutFramingTo = askQuestionAboutFramingTo;
    }

    public String getAskQuestionAboutFramingToOther() {
        return askQuestionAboutFramingToOther;
    }

    public void setAskQuestionAboutFramingToOther(String askQuestionAboutFramingToOther) {
        this.askQuestionAboutFramingToOther = askQuestionAboutFramingToOther;
    }

    public char getDecisionTakingSex() {
        return decisionTakingSex;
    }

    public void setDecisionTakingSex(char decisionTakingSex) {
        this.decisionTakingSex = decisionTakingSex;
    }

    public String getAnySuggestionComments() {
        return anySuggestionComments;
    }

    public void setAnySuggestionComments(String anySuggestionComments) {
        this.anySuggestionComments = anySuggestionComments;
    }

    public int getLandUnit() {
        return landUnit;
    }

    public void setLandUnit(int landUnit) {
        this.landUnit = landUnit;
    }


    public String toString(){
        Log.i("Answer", "Answer: Family:"+maleBelow6+" "+femaleBelow6+" "+male16_14+" "+female16_14+" "+male15_60+" "+female15_60+" "+maleAbove60+" "+femaleAbove60);
        return district +" "+responderName+" "+responderSex+" "+responderAge+" "+householdHead+" "+householdSex+" "+householdAge +" "+vdcMunicipality+" "+wardNo+" "+villageTole+" "+ethnicity+" "+otherEthnicity+" "+educationStatus;
    }
}
