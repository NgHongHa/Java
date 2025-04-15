/*
📘 Các phương thức
STT | Phương Thức | Nội dung

put(key, value) — Thêm một phần tử theo cặp key, value

get(key) — Truy xuất giá trị thông qua key

remove(key) — Xóa 1 phần tử (xóa cả cặp key, value)

containsKey(key) — Kiểm tra xem key có tồn tại trong hashmap?

containsValue(value) — Kiểm tra xem value có tồn tại trong hashmap?

isEmpty() — Kiểm tra xem hashmap có rỗng hay không?

size() — Kiểm tra số lượng phần tử trong hashmap!


 */

import java.util.HashMap;

public class Bai29_Hasmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // thêm ptu
        map.put(1, "chuối");
        map.put(2, "chuối cả nải");
        // lấy gtri của ptu
        String laygt = map.get(2);
        System.out.println(laygt);
    }
}
