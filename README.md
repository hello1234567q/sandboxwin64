# SandVXposed - Android App Sandbox with Xposed Support
![favicon](https://sandboxwin.run.place/icon.png)
**SandVXposed** is a fork project from [VirtualXposed](https://github.com/android-hacker/VirtualXposed) & [VirtualApp](https://github.com/asLody/VirtualApp), improved to support better on new Android versions and add custom interface. This project provides a sandbox environment for Android applications combined with lightweight hooking capabilities like Xposed without root.

---

## 🧪 What is this project?

This project retains the architecture of VirtualApp, which helps create a virtual space to run applications as if they were actually installed. By hooking certain APIs, it also supports some lightweight Xposed modules that work without root.

> ✨ The project in the \`chill\` branch focuses on a new UI interface and some tweaks for compatibility with newer Android.

---

## 📦 Native Project

- VirtualApp: https://github.com/asLody/VirtualApp

- VirtualXposed: https://github.com/android-hacker/VirtualXposed

- SandVXposed (native): https://github.com/asLody/SandVXposed

---

## 🚀 How to build the project

### Requirements:

- Android Studio Flamingo or later

- JDK 8 or 11

- Gradle >= 6.5

- (Optional) Android NDK if you want to build native

### Steps:

\`\`\`bash
git clone --recurse-submodules https://github.com/hello1234567q/sandboxwin64.git
cd sandboxwin64
git checkout chill
\`\`\`

1. Open the project in Android Studio.
2. Sync Gradle and build project.
3. Install APK on Android device with API level >= 19 and <= 28 for best compatibility.
4. Check permissions and sandbox settings in the app.

---

## 🗂 Repo structure

- \`/app\` - Main application source code
- \`/lib\` - Shared libraries
- \`/libs\` - Native libraries and jar files
- \`/docs\` - Tutorials (if any)
- \`README.md\` - Tutorials and project description files

---

## ⚠️ Common errors and how to handle them

- **Build errors due to incorrect SDK or build tools version**

Check \`build.gradle\` to make sure \`compileSdkVersion = 28\` and \`buildToolsVersion = '28.0.3'\`
Update the SDK in Android Studio if necessary.

- **Error related to native libs (jniLibs)**
Make sure the \`libs/\` folder contains the \`.so\` libraries that match \`armeabi-v7a\`.

- **Error when Xposed hook is wrong or not working**
It may be due to changing Android version or Xposed framework, need to check hook logic again.

- **Error pushing git due to remote unpack failed**
Usually due to repo error, try cloning repo or deleting git cache.

- **Error UI not displaying correctly due to hook editing**
You should keep the hook logic, only edit the interface to avoid breaking the flow.

---

## 📝 Original author's note

The SandVXposed project is a sandbox environment for Android, based on VirtualApp with lightweight hook integration for Xposed Framework.
Original Repo: [https://github.com/asLody/SandVXposed](https://github.com/asLody/SandVXposed)

This version has been modified to be compatible with newer Android and improved UI.

---

## 🔗 \`chill\` branch link

You can view and work on the \`chill\` branch at:
https://github.com/hello1234567q/sandboxwin64/tree/chill

---

Thank you for your interest in the project! If you need support, please create an issue on the GitHub repo.

Email✉️:info@sandboxwin.run.place
