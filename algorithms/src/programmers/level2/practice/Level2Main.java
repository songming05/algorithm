package programmers.level2.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level2Main {

    public static void main(String[] args) throws Exception {
        System.out.println("START");
        //124 나라의 숫자
        //https://programmers.co.kr/learn/courses/30/lessons/12899
        //countryOf124();

        //오픈채팅방
        //https://programmers.co.kr/learn/courses/30/lessons/42888
        openChatting();
    }

    private static void openChatting() {
        //["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]	
        //["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        String[] answer = openChattingSolution(record);
        for (String ele : answer) {
            System.out.println(ele);
        }
    }

    private static String[] openChattingSolution(String[] record) {
        String[] answer = {};
        final String ENTER = "님이 들어왔습니다.";
        final String LEAVE = "님이 나갔습니다.";

        List<Map<String, Object>> logList = new ArrayList<>();
        Map<String, Object> nameMap = new HashMap<>();
        int logCnt = 0;
        for (int i = 0; i < record.length; i++) {
            Map<String, Object> personMap = new HashMap<>();
            String input = record[i];
            String[] datas = input.split(" ");
            String command = datas[0];
            String id = datas[1];
            String name = "";
            if(datas.length > 2) name = datas[2];

            if(!"Change".equals(command)) logCnt++;
            personMap.put(id, command);
            logList.add(personMap);
            if(!"".equals(name)) nameMap.put(id, name);
        }

        int idx = 0;
        answer = new String[logCnt];

        for (int i = 0; i < logList.size(); i++) {
            Map<String, Object> personMap = logList.get(i);
            String id = personMap.keySet().iterator().next();
            String name = (String) nameMap.get(id);
            String command = (String) personMap.get(id);

            if("Change".equals(command)) continue;
            if("Enter".equals(command)){
                answer[idx] = name + ENTER;
                idx++;
            } else if("Leave".equals(command)){
                answer[idx] = name + LEAVE;
                idx++;
            }
        }

        return answer;
    }

    private static void countryOf124() {
        System.out.println(countryOf124Solution(1));//1
        System.out.println(countryOf124Solution(2));//2
        System.out.println(countryOf124Solution(3));//4
        System.out.println(countryOf124Solution(4));//11
        System.out.println(countryOf124Solution(40));
    }

    private static String countryOf124Solution(int n) {
        String answer = "";
        StringBuffer stringBuffer = new StringBuffer();
        countryRule(n, stringBuffer);
        answer = stringBuffer.toString();

        return answer;
    }

    private static void countryRule(int n, StringBuffer stringBuffer) {
        int q = n / 3;
        int r = n % 3;
        if(r == 0) q--;

        if(q > 3) countryRule(q, stringBuffer);
        if(q == 1) {
            stringBuffer.append("1");
        }else if(q == 2) {
            stringBuffer.append("2");
        }else if(q == 3) {
            stringBuffer.append("4");
        }

        if(r == 1) {
            stringBuffer.append("1");
        }else if(r == 2) {
            stringBuffer.append("2");
        }else if(r == 0) {
            stringBuffer.append("4");
        }
    }
}
