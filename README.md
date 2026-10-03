# WalletApp — Banking & Finance Dashboard

Современное мобильное приложение для управления финансами и банком на платформах Android, разработанное с использованием **Kotlin**, **ViewBinding** и кастомных компонентов оформления.

---

## 📱 Скриншоты и возможности

- **Финансовый дашборд**: Главная страница с отображением общего баланса расчетного счета.
- **Быстрые действия (Quick Actions)**: Карточки для быстрого выполнения операций (*Deposit*, *Paybill*, *Transfer*).
- **Промо-баннер**: Реферальный баннер (*Refer friends, Get $10*) с кнопкой приглашения.
- **История транзакций**: Список последних операций (`RecyclerView`), где тип транзакции определяет цвет текста, фоновую плашку и иконку (зеленая стрелка для зачислений, красная для списаний).
- **Нижняя навигация**: Стилизованная floating-панель на базе библиотеки `ChipNavigationBar`.

---

## 🛠 Технологический стек

* **Язык**: [Kotlin](https://kotlinlang.org/)
* **UI & Вёрстка**: AndroidX, `ConstraintLayout`, `NestedScrollView`, `RecyclerView`, `Material Components`
* **Связывание представлений**: View Binding (`viewBinding = true`)
* **Библиотеки**:
  * [ChipNavigationBar](https://github.com/ismaeldivita/chip-navigation-bar) (`com.github.ismaeldivita:chip-navigation-bar:1.4.0`)
* **Оформление**: Кастомные XML-шейпы для скругленных углов и адаптивная иконка приложения.

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
