# SandVXposed - Android App Sandbox with Xposed Support

**SandVXposed** là một project fork từ [VirtualXposed](https://github.com/android-hacker/VirtualXposed) & [VirtualApp](https://github.com/asLody/VirtualApp), được cải tiến để hỗ trợ tốt hơn trên các phiên bản Android mới và bổ sung giao diện tùy chỉnh. Dự án này cung cấp môi trường sandbox cho ứng dụng Android kết hợp khả năng hook nhẹ giống Xposed mà không cần root.

---

## 🧪 Dự án này là gì?

Dự án này giữ lại kiến trúc của VirtualApp, giúp tạo không gian ảo để chạy ứng dụng như thể đã cài thực sự. Bằng cách hook API nhất định, nó còn hỗ trợ một số module Xposed nhẹ hoạt động được mà không cần root.

> ✨ Dự án trong nhánh `chill` tập trung vào giao diện UI mới và một số tinh chỉnh để tương thích Android mới hơn.

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

```bash
git clone --recurse-submodules https://github.com/hello1234567q/sandboxwin64.git
cd sandboxwin64
git checkout chill
