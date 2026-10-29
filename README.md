# 🏋️‍♂️ WorkoutApp - Fitness & Workout Android Application

[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://www.android.com/)
[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![Target SDK](https://img.shields.io/badge/Target%20SDK-35-blue.svg)](https://developer.android.com/)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-24-lightgrey.svg)](https://developer.android.com/)

**WorkoutApp** is a modern and intuitive Android fitness application designed to help users organize daily exercise routines, build healthy habits, and practice workouts effectively through integrated video guides.

---

## 📱 Key Features

- **🏃‍♂️ Workout Categories:**
  - **Running:** Cardio and endurance training
  - **Stretching:** Flexibility and post-workout recovery routines
  - **Yoga:** Harmony, posture, and wellness sessions
  - **Strength:** Muscle building and power workouts
- **⏱️ Detailed Workout Metrics:** Track estimated calorie burn (Kcal), total duration, and number of exercises for every workout routine.
- **🎥 Video Lesson Integration (YouTube):** Each lesson includes step-by-step video guidance, seamlessly launching via the YouTube app or web browser fallback.
- **✨ Immersive UI/UX:** Full-screen edge-to-edge layout (`FLAG_LAYOUT_NO_LIMITS`) with custom vector drawables and gradients.
- **⚡ High Performance:** Developed natively with Java and ViewBinding for optimal speed and responsiveness.

---

## 🛠 Tech Stack & Libraries

| Technology / Library | Purpose |
|----------------------|---------|
| **Java 11**          | Core programming language |
| **Android SDK 35**   | Modern Android API features and optimizations |
| **ViewBinding**      | Safe and performant view interaction |
| **Glide (v4.16.0)**  | Efficient image loading and memory caching |
| **RecyclerView**     | Optimized horizontal and vertical list rendering |
| **AndroidX & Material Components** | Contemporary UI elements and backward compatibility |
| **Intents (Implicit / Explicit)**  | Seamless external video playback integration |

---

## 📂 Project Architecture

```
WorkoutApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/workoutapp/
│   │   │   ├── Activity/
│   │   │   │   ├── IntroActivity.java     # Onboarding & welcome screen
│   │   │   │   ├── MainActivity.java      # Dashboard with workout categories
│   │   │   │   └── WorkoutActivity.java   # Workout details & lesson list
│   │   │   ├── Adapter/
│   │   │   │   ├── WorkoutAdapter.java    # Horizontal categories adapter
│   │   │   │   └── LessionsAdapter.java   # Lessons adapter with video links
│   │   │   └── Domain/
│   │   │       ├── Workout.java           # Workout data model
│   │   │       └── Lession.java           # Exercise lesson data model
│   │   └── res/                           # Layouts, drawables, colors, themes
│   └── build.gradle.kts                   # App-level build configurations
└── settings.gradle.kts
```

---

## 🚀 Getting Started

Follow these steps to set up and run the project locally:

### Prerequisites:
- **Android Studio** (Ladybug / Koala or newer recommended)
- **JDK 11** or higher
- Android device or Emulator running Android 7.0 (Nougat / API 24) or above

### Installation:
1. Clone the repository:
   ```bash
   git clone https://github.com/ibrohim2005rajabboyev/WorkoutApp.git
   ```
2. Open **Android Studio**.
3. Select **Open Project** and navigate to the cloned `WorkoutApp` folder.
4. Allow Gradle to download dependencies and sync (`Sync Project with Gradle Files`).
5. Connect your device or start an emulator, then click **Run** (`Shift + F10`).

---

## 👨‍💻 Author

- **Ibrohimjon Rajabboyev**
- **GitHub:** [@ibrohim2005rajabboyev](https://github.com/ibrohim2005rajabboyev)
- **Bio:** Mobile App Developer • Android • Kotlin • Flutter • UI/UX
