import java.util.ArrayList;
import java.util.List;

public class Bai28_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // khai báo với số lươnng phần tử ban đầu
        ArrayList<Integer> list1 = new ArrayList<>(5);
        // khởi tạo luôn các phần tử ban đầu
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4));
        // xuất list
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        // add thêm phần tử
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println(list3);
        //  adđ vào vị trí chỉ định
        list3.add(1, 99);
        System.out.println(list3);
        // trả về giá trị tại vị trí
        System.out.println(list3.get(1));
    }
}
/*
add(index, element) — Thêm một phần tử

size() — Trả về số phần tử của list

get(int index) — Trả về giá trị list tại vị trí index

remove(int index) — Xoá theo vị trí index chỉ định

remove(Integer.valueOf(9)) — Xoá số 9 trong danh sách, linh động áp dụng kiểu dữ liệu #

set(index, element) — Đặt element thay thế vào vị trí index chỉ định

contains() — Kiểm tra Collection có chứa phần tử nào đó hay không

Collections.sort() — Sắp xếp tăng dần

Collections.reverse — Đảo ngược list

List.isEmpty — Kiểm tra danh sách list có rỗng không?

clear() — Xoá toàn bộ phần tử của list ⇒ list rỗng
 */