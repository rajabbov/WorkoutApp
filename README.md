# 🏋️‍♂️ WorkoutApp - Fitness & Workout Android Application

<p align="center">
  <img src="app/src/main/res/drawable-xxhdpi/banner.png" alt="WorkoutApp Banner" width="100%" />
</p>

<p align="center">
  <a href="https://www.android.com/"><img src="https://img.shields.io/badge/Platform-Android-3DDC84.svg?style=flat&logo=android&logoColor=white" alt="Platform" /></a>
  <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Language-Java_11-ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="Language" /></a>
  <a href="https://developer.android.com/"><img src="https://img.shields.io/badge/Target%20SDK-35-blue.svg?style=flat" alt="Target SDK" /></a>
  <a href="https://developer.android.com/"><img src="https://img.shields.io/badge/Min%20SDK-24-lightgrey.svg?style=flat" alt="Min SDK" /></a>
  <a href="https://github.com/ibrohim2005rajabboyev/WorkoutApp/stargazers"><img src="https://img.shields.io/github/stars/ibrohim2005rajabboyev/WorkoutApp?style=flat" alt="Stars" /></a>
  <a href="https://github.com/ibrohim2005rajabboyev/WorkoutApp/network/members"><img src="https://img.shields.io/github/forks/ibrohim2005rajabboyev/WorkoutApp?style=flat" alt="Forks" /></a>
</p>

---

## 📌 Overview

**WorkoutApp** is a native Android fitness application engineered to motivate and guide users through everyday physical workouts. Designed with modern Android architecture principles, it features seamless video lesson integration, rich interactive UI components, and real-time workout stats tracking.

---

## 📱 Key Features

- **🏃‍♂️ Workout Categories:**
  - **Running:** Cardiovascular endurance and stamina building routines.
  - **Stretching:** Muscle recovery, flexibility, and mobility drills.
  - **Yoga:** Breathwork, core balance, and posture wellness sessions.
  - **Strength:** Calisthenics and weighted resistance training.
- **⏱️ Workout Metrics & Tracking:** Detailed duration breakdowns, calorie expenditure estimations (Kcal), and exercise counts per routine.
- **🎥 Integrated Video Lessons:** Seamless one-tap integration with YouTube tutorials for each exercise (supports native YouTube app and browser playback fallback).
- **✨ Immersive UI/UX Design:** Edge-to-edge layout (`FLAG_LAYOUT_NO_LIMITS`), custom gradients, styled typography, and responsive constraint layouts.
- **⚡ High Performance:** Clean separation of concerns with Java models, custom `RecyclerView` adapters, and memory-safe `ViewBinding`.

---

## 🛠 Tech Stack & Libraries

| Category | Technology | Description |
| :--- | :--- | :--- |
| **Language** | [Java 11](https://www.java.com/) | Robust, object-oriented foundational codebase |
| **Platform** | [Android SDK](https://developer.android.com/) | Min SDK: 24 (Android 7.0), Target SDK: 35 (Android 15) |
| **UI Framework** | Android XML + ViewBinding | Null-safe, boilerplate-free view reference binding |
| **Image Loading** | [Glide 4.16.0](https://github.com/bumptech/glide) | Optimized image loading, decoding, and caching |
| **Lists & Grids** | RecyclerView | Multi-orientation list management with custom viewholders |
| **Media & Navigation** | Explicit & Implicit Intents | Direct YouTube integration and deep linking |
| **Design System** | Google Material Components | Material themes, custom shapes, and elevation effects |

---

## 📂 Project Architecture

```
WorkoutApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/workoutapp/
│   │   │   ├── Activity/
│   │   │   │   ├── IntroActivity.java      # Splash & onboarding entry point
│   │   │   │   ├── MainActivity.java       # Category dashboard & workout feed
│   │   │   │   └── WorkoutActivity.java    # Detailed workout view & lesson list
│   │   │   ├── Adapter/
│   │   │   │   ├── WorkoutAdapter.java     # Horizontal category cards adapter
│   │   │   │   └── LessionsAdapter.java    # Exercise lesson items with video launchers
│   │   │   └── Domain/
│   │   │       ├── Workout.java            # Workout entity data model
│   │   │       └── Lession.java            # Exercise lesson model with video links
│   │   └── res/                            # Vector drawables, layouts, colors & themes
│   └── build.gradle.kts                    # App module dependencies & plugins
├── gradle/libs.versions.toml               # Centralized Gradle version catalog
├── gradlew                                 # Unix Gradle wrapper executable
└── settings.gradle.kts                     # Project structure & repositories setup
```

---

## 🚀 Getting Started

To build and run this application on your local machine:

### Prerequisites:
- **Android Studio** (Koala / Ladybug or newer recommended)
- **JDK 11** or higher
- Android Virtual Device (AVD) or physical device running **Android 7.0 (API 24)** or newer

### Installation:
1. Clone this repository:
   ```bash
   git clone https://github.com/ibrohim2005rajabboyev/WorkoutApp.git
   ```
2. Open **Android Studio** and click **File > Open**, then select the cloned `WorkoutApp` folder.
3. Allow Gradle to sync the project dependencies automatically.
4. Connect an Android device with USB debugging enabled, or launch an Emulator.
5. Click the green **Run** button (`Shift + F10`) to build and launch the app.

---

## 👨‍💻 Author

- **Ibrohimjon Rajabboyev**
- **GitHub:** [@ibrohim2005rajabboyev](https://github.com/ibrohim2005rajabboyev)
- **Bio:** Mobile App Developer • Android • Kotlin • Flutter • UI/UX
