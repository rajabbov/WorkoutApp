# 🏋️‍♂️ WorkoutApp - Fitness & Workout Android Application

[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://www.android.com/)
[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![Target SDK](https://img.shields.io/badge/Target%20SDK-35-blue.svg)](https://developer.android.com/)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-24-lightgrey.svg)](https://developer.android.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

**WorkoutApp** — bu foydalanuvchilarga kundalik jismoniy mashqlarni rejalashtirish, sog'lom turmush tarzini shakllantirish va har bir mashqni video qo'llanmalar orqali to'g'ri bajarishga yordam beruvchi zamonaviy Android ilova.

---

## 📱 Asosiy Xususiyatlar (Key Features)

- **🏃‍♂️ Mashq turlari (Workout Categories):**
  - **Running (Yugurish)** — chidamlilik va kardio mashqlari
  - **Stretching (Cho'zilish)** — moslashuvchanlik va tiklanish mashqlari
  - **Yoga** — tana va ong uyg'unligi uchun mashg'ulotlar
  - **Strength (Kuch)** — mushaklarni rivojlantirish va quvvat mashqlari
- **⏱️ Batafsil ma'lumotlar:** Har bir mashg'ulot bo'yicha sarflanadigan kaloriya (Kcal), umumiy davomiylik va mashqlar soni ko'rsatiladi.
- **🎥 Video qo'llanmalar (YouTube Integration):** Har bir darslik (Lession) uchun maxsus video darsliklar integratsiya qilingan (YouTube ilovasi yoki brauzer orqali avtomatik ochiladi).
- **✨ Immersive UI:** To'liq ekranga moslashgan (Edge-to-Edge) zamonaviy va chiroyli dizayn.
- **⚡ Yuqori tezlik:** Native Android (Java) va ViewBinding asosida tezkor ishlash.

---

## 🛠 Texnologiyalar va Kutubxonalar (Tech Stack)

| Texnologiya / Kutubxona | Vazifasi |
|-------------------------|----------|
| **Java 11**             | Asosiy dasturlash tili |
| **Android SDK 35**      | Eng so'nggi Android API imkoniyatlari |
| **ViewBinding**         | Xavfsiz va qulay UI elementlariga bog'lanish |
| **Glide (v4.16.0)**     | Rasmlarni tezkor va samarali yuklash hamda keshlashtirish |
| **RecyclerView**        | Gorizontal va vertikal ro'yxatlarni optimallashtirilgan tarzda chiqarish |
| **AndroidX & Material** | Zamonaviy UI komponentlar va orqaga moslik |
| **Explicit & Implicit Intents** | Darslarni YouTube yoki brauzerda ochish |

---

## 📂 Loyiha Tuzilishi (Project Architecture)

```
WorkoutApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/workoutapp/
│   │   │   ├── Activity/
│   │   │   │   ├── IntroActivity.java     # Ilovaga kirish oynasi
│   │   │   │   ├── MainActivity.java      # Asosiy mashqlar ro'yxati
│   │   │   │   └── WorkoutActivity.java   # Tanlangan mashq tafsilotlari va darslar
│   │   │   ├── Adapter/
│   │   │   │   ├── WorkoutAdapter.java    # Gorizontal mashqlar ro'yxati adapteri
│   │   │   │   └── LessionsAdapter.java   # Mashq darslari adapteri (Video linklar bilan)
│   │   │   └── Domain/
│   │   │       ├── Workout.java           # Mashg'ulot ma'lumotlar modeli
│   │   │       └── Lession.java           # Darslik ma'lumotlar modeli
│   │   └── res/                           # Layoutlar, ranglar, drawables va ikonalar
│   └── build.gradle.kts                   # Ilova darajasidagi konfiguratsiya
└── settings.gradle.kts
```

---

## 🚀 O'rnatish va Ishga Tushirish (Getting Started)

Loyihani kompyuteringizda ishga tushirish uchun quyidagi qadamlarni bajaring:

### Talablar:
- **Android Studio** (Ladybug / Koala yoki undan yangi versiya)
- **JDK 11** yoki undan yuqori
- Android qurilma yoki Emulator (Android 7.0 Nougat - API 24+)

### Qadamlar:
1. Repozitoriyadan nusxa oling:
   ```bash
   git clone https://github.com/ibrohim2005rajabboyev/WorkoutApp.git
   ```
2. **Android Studio** dasturini oching.
3. **Open Project** tugmasini bosib, `WorkoutApp` papkasini tanlang.
4. Gradle sinxronizatsiyasi tugashini kuting (`Sync Project with Gradle Files`).
5. Qurilma yoki emulyatorda ilovani ishga tushiring: **Run** (`Shift + F10`).

---

## 👨‍💻 Muallif (Author)

- **Ibrohimjon Rajabboyev**
- **GitHub:** [@ibrohim2005rajabboyev](https://github.com/ibrohim2005rajabboyev)
- **Bio:** Mobile App Developer • Android • Kotlin • Flutter • UI/UX

---

## 📄 Litsenziya (License)

Ushbu loyiha [MIT License](LICENSE) ostida tarqatiladi.
