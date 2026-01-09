# Big Number Web Calculator

Đây là một ứng dụng web dùng để cộng hai số lớn, được xây dựng bằng Spring Boot.

## Chức năng

- Cung cấp giao diện web đơn giản để nhập hai số.
- Tính tổng của hai số.
- Hiển thị kết quả và các bước thực hiện phép cộng.

## Endpoints

- `GET /`: Hiển thị trang máy tính chính.
- `POST /calculate`: Nhận hai tham số từ form là `number1` và `number2`, sau đó trả về kết quả tính toán.

## Cách chạy ứng dụng

1. Đảm bảo bạn đã cài đặt Java và Maven.
2. Di chuyển đến thư mục `big-number-web`.
3. Chạy ứng dụng bằng lệnh: `mvn spring-boot:run`
4. Mở trình duyệt web và truy cập `http://localhost:8080` (hoặc cổng đã được định cấu hình).