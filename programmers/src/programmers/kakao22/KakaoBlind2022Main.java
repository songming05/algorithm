package programmers.kakao22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class KakaoBlind2022Main {

	public static void main(String[] args) {

		KakaoBlind2022Main kakaoBlind2022Main = new KakaoBlind2022Main();
		//신고 결과 받기
		kakaoBlind2022Main.question01();
	}

	private void question01() {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		//[2,1,1,0]
		int[] result = solution01(id_list, report, k);
		
		System.out.println("\n## solution01");
		for(int ele : result) {
			System.out.print(ele + ", ");
		}
		
		id_list = new String[] {"con", "ryan"};
		report = new String[] {"ryan con", "ryan con", "ryan con", "ryan con"};
		k = 3;
		
		//[0,0]
		result = solution01(id_list, report, k);
		
		System.out.println("\n## solution02");
		for(int ele : result) {
			System.out.print(ele + ", ");
		}
	}
	
	public int[] solution01(String[] id_list, String[] report, int k) {
        int[] answer = {};
        //id별 신고이력
        HashMap<String, HashSet<String>> reportMap = new HashMap<String, HashSet<String>>();
        //id별 신고받은 횟수
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        
        answer = new int[id_list.length];
        
        for(String id : id_list) {
        	countMap.put(id, 0);
        	reportMap.put(id, new HashSet<String>());
        }
        
        for(String history : report) {
        	String[] divideUser = history.split(" ");
        	String user = divideUser[0];
        	String target = divideUser[1];
        	HashSet<String> badUserSet = reportMap.get(user);
        	if(badUserSet.size() == 0) {
        		badUserSet.add(target);
        		countMap.put(target, countMap.get(target) + 1);
        	}else if(!badUserSet.contains(target)) {
        		badUserSet.add(target);
        		countMap.put(target, countMap.get(target) + 1);
        	} else {
				
        	}
        	//System.out.println("user:" + user + ",\ttarget:" + target);
        }
        
        for(String id : countMap.keySet()) {
        	if(countMap.get(id) >= k) {
				//System.out.println("id:" + id + ", k:" + k);
				for (int i = 0; i < id_list.length; i++) {
					if(reportMap.get(id_list[i]).contains(id)) {
						answer[i] = answer[i] + 1;
					}
				}
        	}
        }
        
        
        return answer;
    }
	
	public int[] solution01_Lambda(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

}
