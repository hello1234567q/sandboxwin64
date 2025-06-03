'# SandVXposed - Android App Sandbox with Xposed Support

**SandVXposed** là một project fork từ [VirtualXposed](https://github.com/android-hacker/VirtualXposed) & [VirtualApp](https://github.com/asLody/VirtualApp), được cải tiến để hỗ trợ tốt hơn trên các phiên bản Android mới và bổ sung giao diện tùy chỉnh. Dự án này cung cấp môi trường sandbox cho ứng dụng Android kết hợp khả năng hook nhẹ giống Xposed mà không cần root.

---

## 🧪 Dự án này là gì?

Dự án này giữ lại kiến trúc của VirtualApp, giúp tạo không gian ảo để chạy ứng dụng như thể đã cài thực sự. Bằng cách hook API nhất định, nó còn hỗ trợ một số module Xposed nhẹ hoạt động được mà không cần root.

> ✨ Dự án trong nhánh \`chill\` tập trung vào giao diện UI mới và một số tinh chỉnh để tương thích Android mới hơn.

---

## 📦 Dự án gốc

- VirtualApp: https://github.com/asLody/VirtualApp  
- VirtualXposed: https://github.com/android-hacker/VirtualXposed  
- SandVXposed (gốc): https://github.com/asLody/SandVXposed  

---

## 🚀 Cách build project

### Yêu cầu:
- Android Studio Flamingo hoặc mới hơn  
- JDK 8 hoặc 11  
- Gradle >= 6.5  
- (Tuỳ chọn) Android NDK nếu bạn muốn build native

### Các bước:

\`\`\`bash
git clone --recurse-submodules https://github.com/hello1234567q/sandboxwin64.git
cd sandboxwin64
git checkout chill
\`\`\`

1. Mở project trong Android Studio.  
2. Đồng bộ Gradle và build project.  
3. Cài đặt APK lên thiết bị Android có API level >= 19 và <= 28 để tương thích tốt nhất.  
4. Kiểm tra quyền và các thiết lập sandbox trong app.

---

## 🗂 Cấu trúc repo

- \`/app\` - Mã nguồn ứng dụng chính  
- \`/lib\` - Thư viện dùng chung  
- \`/libs\` - Thư viện native và file jar  
- \`/docs\` - Tài liệu hướng dẫn (nếu có)  
- \`README.md\` - Tập tin hướng dẫn và mô tả dự án

---

## ⚠️ Các lỗi thường gặp và cách xử lý

- **Lỗi build do SDK hoặc build tools không đúng phiên bản**  
  Kiểm tra \`build.gradle\` đảm bảo \`compileSdkVersion = 28\` và \`buildToolsVersion = '28.0.3'\`  
  Cập nhật SDK trong Android Studio nếu cần.

- **Lỗi liên quan đến native libs (jniLibs)**  
  Đảm bảo thư mục \`libs/\` chứa các thư viện \`.so\` phù hợp với \`armeabi-v7a\`.

- **Lỗi khi hook Xposed bị sai hoặc không hoạt động**  
  Có thể do thay đổi phiên bản Android hoặc framework Xposed, cần kiểm tra lại logic hook.

- **Lỗi push git do lỗi remote unpack failed**  
  Thường do repo bị lỗi, thử clone lại repo hoặc xóa cache git.

- **Lỗi UI không hiển thị đúng do chỉnh sửa hook**  
  Nên giữ nguyên logic hook, chỉ sửa giao diện để tránh phá vỡ flow.

---

## 📝 Ghi chú của tác giả gốc

Dự án SandVXposed là môi trường sandbox cho Android, dựa trên VirtualApp với tích hợp hook nhẹ cho Xposed Framework.  
Repo gốc: [https://github.com/asLody/SandVXposed](https://github.com/asLody/SandVXposed)  

Phiên bản này đã chỉnh sửa để tương thích Android mới hơn và cải tiến UI.

---

## 🔗 Liên kết nhánh \`chill\`

Bạn có thể xem và làm việc trên nhánh \`chill\` tại:  
https://github.com/hello1234567q/sandboxwin64/tree/chill

---

Cảm ơn bạn đã quan tâm đến dự án! Nếu cần hỗ trợ, vui lòng tạo issue trên repo GitHub.
