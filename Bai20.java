package BaiHoc1;

public class Bai20 {
    public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) { // bắt đầu với i = 2
            for (int j = 1; j <= 10; j++) { // j = 1
                System.out.println(i + " x " + j + " = " + (i * j)); 
            }
            System.out.println("---"); // sau khi j xong , xuất ra "----" rồi qua i ...
        }
    }
}
/*
 * Bảng cửu chương :
 * 2 * 1 = 2
 * 2 * 2 = 4
 * .....
 * i * j =
 * 
 * hoạt động : dùng lồng "for trong for"
 * 
 * xuất ra i*j, sau đó j = 3 , tm điều kiện
 * j đc tăng , i giữ nguyên do chưa xong vòng của j
 * khi j xong (j = 11) , i mới kết thúc , khi đó i tăng lên 2 , khởi chạy lại
 * vòng
 * cứ thế đến hết đk của i (i = 10) thì dừng
 *
 * for 1 xuất ra
 * for 2 xuất ra , đúng đk , xuất tiếp
 * xuất đến khi hết đk thì dừng , for 1 xuất lên 1 lần , xong for 2 xuất đến khi hết
 * lặp lại đến khi for 1 hết 
 * 
 */