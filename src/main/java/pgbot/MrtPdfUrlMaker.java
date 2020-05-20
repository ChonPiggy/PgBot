package pgbot;

import java.util.HashMap;

public class MrtPdfUrlMaker {
    static HashMap<String, String> sMrtPdfTable = new HashMap<String, String>();
    static String getMrtPdfUrl(String station) {
        if (sMrtPdfTable.size() == 0) {
            sMrtPdfTable.put("動物園", "019");
            sMrtPdfTable.put("木柵", "018");
            sMrtPdfTable.put("萬芳社區", "017");
            sMrtPdfTable.put("萬芳醫院", "016");
            sMrtPdfTable.put("辛亥", "015");
            sMrtPdfTable.put("麟光", "014");
            sMrtPdfTable.put("六張犁", "013");
            sMrtPdfTable.put("科技大樓", "012");
            sMrtPdfTable.put("大安", "011");
            sMrtPdfTable.put("忠孝復興", "010");
            sMrtPdfTable.put("南京復興", "009");
            sMrtPdfTable.put("中山國中", "008");
            sMrtPdfTable.put("松山機場", "007");
            sMrtPdfTable.put("大直", "021");
            sMrtPdfTable.put("劍南路", "022");
            sMrtPdfTable.put("西湖", "023");
            sMrtPdfTable.put("港墘", "024");
            sMrtPdfTable.put("文德", "025");
            sMrtPdfTable.put("內湖", "026");
            sMrtPdfTable.put("大湖公園", "027");
            sMrtPdfTable.put("葫洲", "028");
            sMrtPdfTable.put("東湖", "029");
            sMrtPdfTable.put("南港軟體園區", "030");
            sMrtPdfTable.put("南港展覽館", "031");
            sMrtPdfTable.put("象山站", "099");
            sMrtPdfTable.put("台北101", "100");
            sMrtPdfTable.put("信義安和", "101");
            sMrtPdfTable.put("大安", "011");
            sMrtPdfTable.put("大安森林公園", "103");
            sMrtPdfTable.put("東門", "134");
            sMrtPdfTable.put("中正紀念堂", "042");
            sMrtPdfTable.put("台大醫院", "050");
            sMrtPdfTable.put("臺大醫院", "050");
            sMrtPdfTable.put("台北車站", "051");
            sMrtPdfTable.put("臺北車站", "051");
            sMrtPdfTable.put("中山", "053");
            sMrtPdfTable.put("雙連", "054");
            sMrtPdfTable.put("民權西路", "055");
            sMrtPdfTable.put("圓山", "056");
            sMrtPdfTable.put("劍潭", "057");
            sMrtPdfTable.put("士林", "058");
            sMrtPdfTable.put("芝山", "059");
            sMrtPdfTable.put("明德", "060");
            sMrtPdfTable.put("石牌", "061");
            sMrtPdfTable.put("唭哩岸", "062");
            sMrtPdfTable.put("奇里岸", "062");
            sMrtPdfTable.put("奇岩", "063");
            sMrtPdfTable.put("北投", "064");
            sMrtPdfTable.put("新北投", "065");
            sMrtPdfTable.put("復興崗", "066");
            sMrtPdfTable.put("忠義", "067");
            sMrtPdfTable.put("關渡", "068");
            sMrtPdfTable.put("竹圍", "069");
            sMrtPdfTable.put("紅樹林", "070");
            sMrtPdfTable.put("淡水", "071");
            sMrtPdfTable.put("新店", "033");
            sMrtPdfTable.put("新店區公所", "034");
            sMrtPdfTable.put("七張", "035");
            sMrtPdfTable.put("小碧潭", "032");
            sMrtPdfTable.put("大坪林", "036");
            sMrtPdfTable.put("景美", "037");
            sMrtPdfTable.put("萬隆", "038");
            sMrtPdfTable.put("公館", "039");
            sMrtPdfTable.put("台電大樓", "040");
            sMrtPdfTable.put("臺電大樓", "040");
            sMrtPdfTable.put("古亭", "041");
            sMrtPdfTable.put("中正紀念堂", "042");
            sMrtPdfTable.put("小南門", "043");
            sMrtPdfTable.put("西門", "086");
            sMrtPdfTable.put("北門", "105");
            sMrtPdfTable.put("中山", "053");
            sMrtPdfTable.put("松江南京", "132");
            sMrtPdfTable.put("南京復興", "009");
            sMrtPdfTable.put("台北小巨蛋", "109");
            sMrtPdfTable.put("臺北小巨蛋", "109");
            sMrtPdfTable.put("南京三民", "110");
            sMrtPdfTable.put("松山", "111");
            sMrtPdfTable.put("南勢角", "048");
            sMrtPdfTable.put("景安", "047");
            sMrtPdfTable.put("永安市場", "046");
            sMrtPdfTable.put("頂溪", "045");
            sMrtPdfTable.put("古亭", "041");
            sMrtPdfTable.put("東門", "134");
            sMrtPdfTable.put("忠孝新生", "089");
            sMrtPdfTable.put("松江南京", "132");
            sMrtPdfTable.put("行天宮", "131");
            sMrtPdfTable.put("中山國小", "130");
            sMrtPdfTable.put("民權西路", "055");
            sMrtPdfTable.put("大橋頭", "128");
            sMrtPdfTable.put("台北橋", "127");
            sMrtPdfTable.put("臺北橋", "127");
            sMrtPdfTable.put("菜寮", "126");
            sMrtPdfTable.put("三重", "125");
            sMrtPdfTable.put("先嗇宮", "124");
            sMrtPdfTable.put("頭前庄", "123");
            sMrtPdfTable.put("新莊", "122");
            sMrtPdfTable.put("輔大", "121");
            sMrtPdfTable.put("丹鳳", "180");
            sMrtPdfTable.put("迴龍", "179");
            sMrtPdfTable.put("三重國小", "178");
            sMrtPdfTable.put("三和國中", "177");
            sMrtPdfTable.put("徐匯中學", "176");
            sMrtPdfTable.put("三民高中", "175");
            sMrtPdfTable.put("蘆洲", "174");
            sMrtPdfTable.put("頂埔", "076");
            sMrtPdfTable.put("永寧", "077");
            sMrtPdfTable.put("土城", "078");
            sMrtPdfTable.put("海山", "079");
            sMrtPdfTable.put("亞東醫院", "080");
            sMrtPdfTable.put("府中", "081");
            sMrtPdfTable.put("板橋", "082");
            sMrtPdfTable.put("新埔", "083");
            sMrtPdfTable.put("江子翠", "084");
            sMrtPdfTable.put("龍山寺", "085");
            sMrtPdfTable.put("西門", "086");
            sMrtPdfTable.put("台北車站", "051");
            sMrtPdfTable.put("臺北車站", "051");
            sMrtPdfTable.put("善導寺", "088");
            sMrtPdfTable.put("忠孝新生", "089");
            sMrtPdfTable.put("忠孝復興", "010");
            sMrtPdfTable.put("忠孝敦化", "091");
            sMrtPdfTable.put("國父紀念館", "092");
            sMrtPdfTable.put("市政府", "093");
            sMrtPdfTable.put("永春", "094");
            sMrtPdfTable.put("後山埤", "095");
            sMrtPdfTable.put("昆陽", "096");
            sMrtPdfTable.put("南港", "097");
            sMrtPdfTable.put("南港展覽館", "021");
        }
         String result = sMrtPdfTable.get(station);
         if (result != null) {
             return "https://web.metro.taipei/img/ALL/TTPDF/" + result + ".pdf";
         }
         return "";
    }
}