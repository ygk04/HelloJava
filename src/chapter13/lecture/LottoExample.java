package chapter13.lecture;

import java.util.*;

public class LottoExample {
    public static void main(String[] args) {
        Random rand = new Random();
        // 45개 중 6개 번호
        Set<Integer> lottoNumbers = new HashSet<Integer>();

        while(lottoNumbers.size() < 6) {
            int lottoNumber = 1+ rand.nextInt(45); // 1 ~ 45
            lottoNumbers.add(lottoNumber);
        }
        // 순서가 없기 때문에 정렬도 불가능
        // Collections.sort(); 리스트 인터페이스만 sort 가능
        System.out.println("Set: " + lottoNumbers);

        List<Integer> lottoList = new ArrayList<Integer>(lottoNumbers);

        Collections.sort(lottoList);

        System.out.println("Sorted List : " + lottoList);
    }
}
