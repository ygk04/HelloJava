package chapter06.lecture;

// 사용자가 정의한 계산기 클래스
public class Calculator {

  // 덧셈 메서드 : add
  public static double add(double num1, double num2){
      return num1 + num2;
  }

  // 뺄셈 메서드 : subtract
  public static double subtract(double num1, double num2){
      return num1 - num2;
  }

  // 곰셉 메서드 : multiply
  public static double multiply(double num1, double num2){
      return num1 * num2;
  }
  // 나눗셈 메서드 : divide, 0으로 나눌시 예외
    public static double divide(double num1, double num2){
        if (num2 != 0)
      return num1 / num2;
        else
            throw new ArithmeticException("0으로 나눌수 없음");
    }
  // 거듭제곱 메서드 : power
  public static double power(double base, double exponent){
      return Math.pow(base, exponent);
  }

  // 제곱근 메서드 : squareRoot,
  public static double squareRoot(double num){
      if (num >= 0)
      return Math.sqrt(num);
      else
          throw new RuntimeException("음수의 제곱근은 실수로 표현 불가");

  }

  // 절대값 메서드  : absoluteValue
  public static double absoluteValue(double num ){
      return num >=0? num : num;
  }




}
