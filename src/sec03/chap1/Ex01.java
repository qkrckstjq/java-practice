package sec03.chap1;

public class Ex01 {
    public static void main(String[] args) {
        //사이즈
        byte _1b_byte = 1;
        //-128 ~ 127 (0은 양수에 포함)
        short _2b_short = 2;
        //-32768 ~ 32767
        int _4b_int = 4;
        //-2147483648 ~ 2147483647
        long _8b_long = 8;//long으로 선언되어있지만 뒤에 L을 붙여주지 않으면 int임
        //-9223372036854775808 ~ 9223372036854775807

        long long_number = 92233720368547758L;
        //long으로 선언했지만 int보다 큰 수일때 L을 붙여줘야함
    }
}
