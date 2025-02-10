package chapter11.lecture;

// trim() 메서드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴
// 앞뒤의 공백을 제거할 뿐 중간의 공백은 제거하지 않음
public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = "  02" ;
        String tel2 = "123  ";
       /* String tel2 = "1    23  ";*/
        String tel3 = "  1234  ";


        String tel = tel1.trim() + "-" +tel2.trim() + "-" + tel3.trim();
        /*String tel = tel1.trim() + "-" +tel2.replace(" ", "") + "-" + tel3.trim();*/
        System.out.println(tel);

        // split 공백 없에기
        // split (String regex), "\\s+" : 하나이상 공백을 의미

    }
}
