# WalletApp — Banking & Finance Dashboard

Современное мобильное приложение для управления финансами и банком на платформе Android, разработанное с использованием **Kotlin**, **ViewBinding** и кастомных компонентов оформления.

Вы можете сразу скачать и установить приложение на ваше устройство:
- **Скачать готовый APK**: перейдите в раздел [GitHub Releases](../../releases) и скачайте актуальный файл `.apk`.
- **Собрать из исходного кода**: подробные инструкции приведены ниже в разделе [Запуск и сборка](#-запуск-и-сборка).

---

## 🛠 Технологический стек

* **Язык**: [Kotlin](https://kotlinlang.org/)
* **UI & Вёрстка**: AndroidX, `ConstraintLayout`, `NestedScrollView`, `RecyclerView`, `Material Components`
* **Связывание представлений**: View Binding (`viewBinding = true`)
* **Библиотеки**:
  * [ChipNavigationBar](https://github.com/ismaeldivita/chip-navigation-bar) (`com.github.ismaeldivita:chip-navigation-bar:1.4.0`)
* **Оформление**: Кастомные XML-шейпы для скругленных углов и адаптивная иконка приложения.

---

## 🎥 Демонстрация работы

В данном разделе представлена видеодемонстрация работы WalletApp на реальном устройстве/эмуляторе:

![Демонстрация работы приложения](demo/demo.gif)

> *Примечание: Запись экрана работы приложения расположена в директории [`demo/`](demo/).*

---

## 📸 Скриншоты

| Скриншот | Описание |
| :---: | :--- |
| ![Главная страница](screenshots/dashboard.png) | **Главный дашборд**: баланс счета ($185,540), быстрое меню действий (*Deposit*, *Paybill*, *Transfer*) и реферальный баннер. |
| ![История транзакций](screenshots/transactions.png) | **История транзакций**: список операций с динамической цветовой индикацией доходов (зеленый) и расходов (красный). |
| ![Нижняя навигация](screenshots/navigation.png) | **Floating ChipNavigationBar**: стилизованное меню навигации с кастомными иконками и закругленным фоном. |

---

## 📂 Структура проекта

```text
WalletApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/kerikir/walletapp/
│   │   │   ├── Adapter/
│   │   │   │   └── TransactionAdapter.kt  # Адаптер для списка транзакций
│   │   │   ├── Model/
│   │   │   │   └── Transaction.kt         # Data-класс модели транзакции
│   │   │   └── MainActivity.kt            # Главный экран приложения
│   │   └── res/
│   │       ├── drawable/                  # Кастомные XML-шейпы и иконки
│   │       ├── layout/
│   │       │   ├── activity_main.xml          # Разметка главного экрана
│   │       │   └── transection_viewholder.xml # Элемент списка транзакций
│   │       ├── menu/
│   │       │   └── bottom_menu.xml        # Меню для ChipNavigationBar
│   │       └── values/
│   │           ├── colors.xml             # Палитра цветов приложения
│   │           └── strings.xml            # Строковые ресурсы
│   └── build.gradle.kts                   # Конфигурация модуля app
├── screenshots/                           # Папка для скриншотов приложения
├── demo/                                  # Папка для видеозаписи/GIF работы приложения
├── settings.gradle.kts                    # Настройка репозиториев (JitPack)
└── README.md
```

---

## 🚀 Запуск и сборка

### Требования
* **Android Studio**: Ladybug / Jellyfish (или новее)
* **JDK**: 11 or 17
* **Min SDK**: 24 (Android 7.0)
* **Target SDK**: 36

### Инструкция по сборке

1. Клонируйте репозиторий:
   ```bash
   git clone <url-репозитория>
   ```
2. Откройте проект в **Android Studio**.
3. Дождитесь завершения Gradle Sync.
4. Запустите сборку через CLI или Android Studio:
   ```bash
   ./gradlew assembleDebug
   ```
5. Запустите приложение на эмуляторе или физическом устройстве.
