package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam4 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "서울시 강서구");
		Map<String, String> map1 = new HashMap<>();
		map1.put("이름", "김길동");
		map1.put("나이", "2");
		map1.put("주소", "인천 계양구");
		Map<String, String> map2 = new HashMap<>();
		map2.put("이름", "고길동");
		map2.put("나이", "44");
		map2.put("주소", "부산 강서구");
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map);
		mapList.add(map1);
		mapList.add(map2);
		System.out.println(mapList.get(0).get("이름"));
				
	}

}
