# Crypto Tracker 📊  

A sleek and modern cryptocurrency tracking app built using **Jetpack Compose**. The app provides a list of cryptocurrencies with key details like market cap, price, and 24-hour changes. It also adapts to landscape mode to display both the coin list and detailed information on the same screen, utilizing **Adaptive Navigation** for an optimized user experience.

This app was developed as part of **Philipp Lackner’s course**, *The Best Practice Guide to Android Architecture*, showcasing the latest best practices in Android development.

---

## Features ✨  
- 📋 **Cryptocurrency List**: Displays a list of cryptocurrencies with real-time data, including:
  - Market Cap
  - Current Price
  - 24-Hour Change
- 📱 **Adaptive Navigation**:
  - **Portrait Mode**: View the list or coin details individually.
  - **Landscape Mode**: View both the list and selected coin details side by side for a master-detail experience.
- 🧼 **Clean Architecture**: Ensures a modular, maintainable, and testable codebase.
- 🚀 **Reactive and Modern Design** with MVI pattern.

---

## Screenshots 📷  

<div align="center">

| Coin List Screen                      | Coin Details Screen               |
|------------------------------------|--------------------------------------|
| <img src="https://github.com/user-attachments/assets/f5320169-5651-4ab1-bcda-9e60e8ff585f" alt="Category Screen" width="300"/> | <img src="https://github.com/user-attachments/assets/a9c56f7d-64d6-4d6a-8eb7-ce701882b1fc" alt="News Details Screen" width="300"/> |

| Landscape Screen                     |
|------------------------------------|
| <img src="https://github.com/user-attachments/assets/4b55dcfe-929f-4b63-915a-ebc14561c108" alt="Drawer Screen" width="700"/> |


</div>

---

## Demo 🎥  
<div align="center">

https://github.com/user-attachments/assets/199f1549-8ae8-40d6-acb5-b04fd3d5d99d

</div>

---

## Technologies Used 🛠️  

- **Jetpack Compose**: For building modern, declarative UIs.  
- **Kotlin**: A concise and expressive programming language.  
- **Koin**: For dependency injection, keeping the app modular and testable.  
- **Ktor**: For seamless API integration to fetch cryptocurrency data.  
- **Adaptive Navigation**: To provide context-aware navigation for different screen orientations.  
- **MVI Architecture**: Ensures unidirectional data flow and scalability.  
- **Clean Architecture**: A modular approach with clear separation of concerns.  

---

## How It Works ⚙️  

1. **API Integration**: Fetches live cryptocurrency data using **Ktor**.  
2. **Dependency Injection**: Managed with **Koin** for clean code structure.  
3. **Reactive UI**: Updates dynamically using Jetpack Compose and MVI.  
4. **Adaptive Navigation**:  
   - **Portrait Mode**: Focused experience with a single screen at a time.  
   - **Landscape Mode**: Enhanced experience with a split-screen layout for coin list and details.  

