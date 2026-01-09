# Big Number Calculator (Cộng hai số lớn)

Đây là một dự án Java đơn giản để thực hiện phép cộng hai số nguyên lớn, được biểu diễn dưới dạng chuỗi.

## Cấu trúc file quan trọng

- **Mã nguồn chính**: `src/main/java/main/MyBigNumber.java`
  - Đây là nơi chứa logic chính để thực hiện phép cộng hai số lớn.

- **Mã nguồn kiểm thử (Test)**: `src/test/java/main/MyBigNumberTest.java`
  - Chứa các test case để xác minh tính đúng đắn của lớp `MyBigNumber`.

- **File cấu hình Maven**: `pom.xml`
  - Định nghĩa các phụ thuộc (dependencies) và cách Maven xây dựng dự án.

## Yêu cầu

- JDK 21 hoặc mới hơn.
- Apache Maven.

## Cách biên dịch và xây dựng dự án

Bạn có thể sử dụng Maven để biên dịch và xây dựng dự án. Mở terminal hoặc command prompt ở thư mục gốc của dự án (thư mục chứa file `pom.xml`) và chạy lệnh sau:

```shell
mvn clean install
```

Lệnh này sẽ thực hiện các công việc sau:
- `clean`: Xóa các file đã được biên dịch trước đó (trong thư mục `target`).
- `install`: Biên dịch mã nguồn, chạy các unit test, và đóng gói dự án thành một file JAR.

## Cách chỉ biên dịch (không chạy test)

Nếu bạn chỉ muốn biên dịch mã nguồn mà không cần chạy các test case, hãy dùng lệnh:

```shell
mvn compile
```

## Cách chạy Test Case

Dự án đã có sẵn các unit test để kiểm tra tính đúng đắn của hàm `sum`. Để chạy các test này, sử dụng lệnh sau:

```shell
mvn test
```

Lệnh này sẽ thực thi tất cả các test case trong file `MyBigNumberTest.java` và báo cáo kết quả. Nếu tất cả các test đều "passed", nghĩa là chương trình đang hoạt động đúng như mong đợi.
