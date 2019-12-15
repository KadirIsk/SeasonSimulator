package services;

import entity.TemperatureCondition;

public class Utility {

    public static String seasonInfo = "Mevsim Bilgileri";
    public static String seasonName = "Mevsim Adi";
    public static String seasonLength = "Mevsim Uzunlugu";
    public static String environment = "Ortam";

    public static String seasonTemperature = "Mevsim Sicakliklari";
    public static String minTemperature = "En Dusuk Sicaklik";
    public static String normalTemperature = "Mevsim Normali";
    public static String maxTemperature = "En Yuksek Sicaklik";


    public static String animalInfo = "Canli Bilgileri";
    public static String index = "Sira";
    public static String genus = "Ait Oldugu Tur";
    public static String weight = "Agirlik";
    public static String feedingFrequency = "Beslenme Sikligi";
    public static String healthSituation = "Saglik Durumu";

    public static String topBottomEdgeBrick = "-";
    public static String cornerBrick = "+";
    public static String rightLeftBrick = "|";
    public static int titleMargin = 2;

    public static void printAnimalInfoTitle(){
        int subTitleLengthAI = titleMargin + index.length() + titleMargin + 1 +
                               titleMargin + genus.length() + titleMargin + 1 +
                               titleMargin + weight.length() + titleMargin + 1 +
                               titleMargin + feedingFrequency.length() + titleMargin + 1 +
                               titleMargin + healthSituation.length() + titleMargin;
        int topTitleLeftMarginAI = (subTitleLengthAI - animalInfo.length()) / 2;
        int topTitleRightMarginAI = (subTitleLengthAI - animalInfo.length() - topTitleLeftMarginAI);

        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(subTitleLengthAI, topBottomEdgeBrick));

        System.out.print(cornerBrick);

        System.out.println();
        System.out.print(rightLeftBrick);
        System.out.print(getEdgeOrWall(topTitleLeftMarginAI, " "));
        System.out.print(animalInfo);
        System.out.print(getEdgeOrWall(topTitleRightMarginAI, " "));
        System.out.print(rightLeftBrick);


        System.out.println();
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(subTitleLengthAI, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.println();
        System.out.print(rightLeftBrick);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(index);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(genus);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(weight);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(feedingFrequency);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(healthSituation);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        printAnimalInfoBottomEdge();

    }

    public static void printAnimalInfo(String index, String animalGenus, String weight, String feedingPeriod, String healthSituation){
        int total = titleMargin + Utility.index.length() + titleMargin;
        int leftMargin = (total - index.length()) / 2;
        int rightMargin = total - leftMargin - index.length();

        System.out.print(rightLeftBrick);
        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(index);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + genus.length() + titleMargin;
        leftMargin = (total - animalGenus.length()) / 2;
        rightMargin = total - leftMargin - animalGenus.length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(animalGenus);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + Utility.weight.length() + titleMargin;
        leftMargin = (total - weight.length()) / 2;
        rightMargin = total - leftMargin - weight.length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(weight);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + Utility.feedingFrequency.length() + titleMargin;
        leftMargin = (total - feedingPeriod.length()) / 2;
        rightMargin = total - leftMargin - feedingPeriod.length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(feedingPeriod);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + Utility.healthSituation.length() + titleMargin;
        leftMargin = (total - healthSituation.length()) / 2;
        rightMargin = total - leftMargin - healthSituation.length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(healthSituation);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        printAnimalInfoBottomEdge();
    }

    public static void printAnimalInfoBottomEdge(){
        System.out.println();
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(titleMargin + index.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.print(getEdgeOrWall(titleMargin + genus.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.print(getEdgeOrWall(titleMargin + weight.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.print(getEdgeOrWall(titleMargin + feedingFrequency.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.print(getEdgeOrWall(titleMargin + healthSituation.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.println();
    }

    public static void printSeasonInfoTitle(){
        int subTitleLengthSI = titleMargin + seasonName.length() + titleMargin + 1 +
                titleMargin + seasonLength.length() + titleMargin + 1 +
                titleMargin + environment.length() + titleMargin;
        int topTitleLeftMarginSI = (subTitleLengthSI - seasonInfo.length()) / 2;
        int topTitleRightMarginSI = (subTitleLengthSI - seasonInfo.length() - topTitleLeftMarginSI);

        int subTitleLengthST = titleMargin + minTemperature.length() + titleMargin + 1 +
                               titleMargin + normalTemperature.length() + titleMargin + 1 +
                               titleMargin + maxTemperature.length() + titleMargin;
        int topTitleLeftMarginST = (subTitleLengthST - seasonTemperature.length()) / 2;
        int topTitleRightMarginST = (subTitleLengthST - seasonTemperature.length() - topTitleLeftMarginST);

        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(subTitleLengthSI, topBottomEdgeBrick));

        System.out.print(cornerBrick);

        System.out.print(getEdgeOrWall(subTitleLengthST, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.println();
        System.out.print(rightLeftBrick);
        System.out.print(getEdgeOrWall(topTitleLeftMarginSI, " "));
        System.out.print(seasonInfo);
        System.out.print(getEdgeOrWall(topTitleRightMarginSI, " "));

        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(topTitleLeftMarginST, " "));
        System.out.print(seasonTemperature);
        System.out.print(getEdgeOrWall(topTitleRightMarginST, " "));
        System.out.print(rightLeftBrick);

        System.out.println();
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(subTitleLengthSI, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(subTitleLengthST, topBottomEdgeBrick));
        System.out.print(cornerBrick);

        System.out.println();
        System.out.print(rightLeftBrick);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(seasonName);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(seasonLength);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(environment);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(minTemperature);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(normalTemperature);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(maxTemperature);
        System.out.print(getEdgeOrWall(titleMargin, " "));
        System.out.print(rightLeftBrick);

        printSeasonBottomEdge(true);
    }

    public static void printSeasonInfo(String seasonName, String seasonLength, String environment, TemperatureCondition temperatureCondition, boolean isBottomEdge){
        int total = titleMargin + Utility.seasonName.length() + titleMargin;
        int leftMargin = (total - seasonName.length()) / 2;
        int rightMargin = total - leftMargin - seasonName.length();

        System.out.print(rightLeftBrick);
        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(seasonName);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + Utility.seasonLength.length() + titleMargin;
        leftMargin = (total - seasonLength.length()) / 2;
        rightMargin = total - leftMargin - seasonLength.length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(seasonLength);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + Utility.environment.length() + titleMargin;
        leftMargin = (total - environment.length()) / 2;
        rightMargin = total - leftMargin - environment.length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(environment);
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + minTemperature.length() + titleMargin;
        leftMargin = (total - Double.toString(temperatureCondition.getSeasonMinTemperature()).length()) / 2;
        rightMargin = total - leftMargin - Double.toString(temperatureCondition.getSeasonMinTemperature()).length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(temperatureCondition.getSeasonMinTemperature());
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + normalTemperature.length() + titleMargin;
        leftMargin = (total - Double.toString(temperatureCondition.getSeasonTemperature()).length()) / 2;
        rightMargin = total - leftMargin - Double.toString(temperatureCondition.getSeasonTemperature()).length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(temperatureCondition.getSeasonTemperature());
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        total = titleMargin + maxTemperature.length() + titleMargin;
        leftMargin = (total - Double.toString(temperatureCondition.getSeasonMaxTemperature()).length()) / 2;
        rightMargin = total - leftMargin - Double.toString(temperatureCondition.getSeasonMaxTemperature()).length();

        System.out.print(getEdgeOrWall(leftMargin, " "));
        System.out.print(temperatureCondition.getSeasonMaxTemperature());
        System.out.print(getEdgeOrWall(rightMargin, " "));
        System.out.print(rightLeftBrick);

        printSeasonBottomEdge(isBottomEdge);
    }

    public static void printSeasonBottomEdge(boolean isBottomEdge){
        System.out.println();
        System.out.print(isBottomEdge ? cornerBrick : rightLeftBrick);
        System.out.print(getEdgeOrWall(titleMargin + seasonName.length() + titleMargin, isBottomEdge ? topBottomEdgeBrick : " "));
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(titleMargin + seasonLength.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(titleMargin + environment.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(titleMargin + minTemperature.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(titleMargin + normalTemperature.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.print(getEdgeOrWall(titleMargin + maxTemperature.length() + titleMargin, topBottomEdgeBrick));
        System.out.print(cornerBrick);
        System.out.println();
    }

    public static String getEdgeOrWall(int count, String brick){
        String edge = "";
        for(int i = 0; i < count; i++, edge += brick);
        return edge;
    }
}
