## 📌 **1. Online Payment Gateway**  

### 📖 Description  
This project is a payment processing system that supports transactions via Credit Cards, PayPal, and Cryptocurrency. It implements Factory Pattern and Adapter Pattern to provide a flexible and scalable payment system  

🛠️ Features

-  Select a payment method (Credit Card, PayPal, Crypto).
-  Validate and process payments securely.
-  Log transactions for future reference.
-  Uses Factory Pattern for creating payment methods.
-  Uses Adapter Pattern to integrate external services.

### 🏗️ **Project Structure**  
```
/Online_Payment_Gateway
 ├── creditcard
 │   ├── CreditCardPayment.java  # Handles credit card payments
 │   ├── CreditCardValidator.java  # Validates credit card details
 │   ├── ExternalCreditCardProcessor.java  # Simulates external credit card processor
 │
 ├── Crypto
 │   ├── CryptoPayment.java  # Handles cryptocurrency payments
 │
 ├── payment
 │   ├── PaymentFactory.java  # Factory for creating payment methods
 │   ├── PaymentMethod.java  # Interface for all payment methods
 │   ├── PaymentType.java  # Enum defining payment types
 │
 ├── paypal
 │   ├── ExternalPayPalService.java  # Simulates external PayPal API
 │   ├── PayPalPaymentAdapter.java  # Adapter for PayPal integration
 │
 ├── transaction
 │   ├── Transaction.java  # Represents a transaction
 │   ├── TransactionLogger.java  # Singleton logger for transaction history
 │   ├── TransactionResult.java  # Stores transaction results
 │   ├── TransactionStatus.java  # Enum defining transaction statuses
 │
 └── App.java  # Main application class (console UI)

```

### 🚀 **Run Instructions**  
1. Clone the repository:  
   ```sh
   git clone https://github.com/your-repo/Online_Payment_Gateway.git
   cd Online_Payment_Gateway
   ```
2. Compile and run:  
   ```sh
   javac -d out $(find . -name "*.java")
   java -cp out org.Temirjohn.Online_Payment_Gateway.App
   ```

---

## ☕ **2. Coffee Shop Simulator**  

### 📖 Description  
`Coffee Shop Simulator` is a Java application that simulates a coffee ordering system with **decorators** for adding toppings. It implements **Factory Pattern** and **Decorator Pattern**.  

### 🛠️ **Features**  
- Select a coffee type (Espresso, Cappuccino, Latte, Americano).  
- Add toppings (Milk, Caramel, Chocolate, Whipped Cream).  
- Automatically calculate the total price.  

### 🏗️ **Project Structure**  
```
/Coffee_Shop_Simulator
 ├── src/main/java/org/Temirjohn/Coffee_Shop_Simulator
 │   ├── CoffeeShop.java  # Main application class (console UI)
 │   ├── coffee
 │   │   ├── Coffee.java  # Coffee interface
 │   │   ├── Espresso.java  # Espresso class
 │   │   ├── Cappuccino.java  # Cappuccino class
 │   │   ├── Latte.java  # Latte class
 │   │   ├── Americano.java  # Americano class
 │   ├── CoffeeFactory
 │   │   ├── CoffeeFactory.java  # Factory for creating coffee
 │   ├── decorator
 │   │   ├── CoffeeDecorator.java  # Base decorator class
 │   │   ├── MilkDecorator.java  # Milk decorator
 │   │   ├── CaramelSyrupDecorator.java  # Caramel syrup decorator
 │   │   ├── WhippedCreamDecorator.java  # Whipped cream decorator
 │   │   ├── ChocolateDecorator.java  # Chocolate syrup decorator
 └── README.md
```

### 🚀 **Run Instructions**  
1. Clone the repository:  
   ```sh
   git clone https://github.com/your-repo/Coffee_Shop_Simulator.git
   cd Coffee_Shop_Simulator
   ```
2. Compile and run:  
   ```sh
   javac -d out $(find . -name "*.java")
   java -cp out org.Temirjohn.Coffee_Shop_Simulator.CoffeeShop
   ```

---

## 🏠 **3. Smart Home System**  

### 📖 Description  
This project is a Smart Home Automation System that manages smart devices using design patterns like Abstract Factory, Adapter, Composite, Decorator, and Facade. It allows for efficient device management, automation, and energy-saving features. 

### 🛠️ **Features**  
✔️ Device Control – Manage smart lights, security cameras, and heaters.
✔️ Automation – Schedule devices, activate power-saving modes.
✔️ Modular Design – Uses design patterns for scalability.
✔️ Facade Pattern – Simplifies interaction with the entire system.

### 🏗️ **Project Structure**  
```
/Smart_Home_Control_System
 ├── Abstract_Factory
 │   ├── AdvancedSmartHomeFactory.java  # Creates advanced smart home setups
 │   ├── BasicSmartHomeFactory.java  # Creates basic smart home setups
 │   ├── SmartHomeFactory.java  # Factory interface for smart home creation
 │
 ├── Adapter
 │   ├── HeaterAdapter.java  # Adapts third-party heaters for integration
 │   ├── ThirdPartyHeater.java  # Simulated third-party heater API
 │
 ├── Composite
 │   ├── AppleSecurityCamera.java  # Apple-compatible security camera
 │   ├── Light.java  # Basic light device
 │   ├── Room.java  # Represents a smart room with multiple devices
 │   ├── SecurityCamera.java  # Standard security camera
 │   ├── SmartDevice.java  # Interface for all smart devices
 │   ├── SmartLight.java  # Smart lighting system
 │
 ├── Decorator
 │   ├── DeviceDecorator.java  # Base class for device decorators
 │   ├── PowerSavingMode.java  # Adds energy-saving functionality to devices
 │   ├── ScheduledDevice.java  # Adds scheduling capability to devices
 │
 ├── Facade
 │   ├── SmartHomeFacade.java  # Provides a simple interface to control smart devices
 │
 ├── SmartHomeSystem.java  # Main application entry point
 └── README.md

```

### 🚀 **Run Instructions**  
1. Clone the repository:  
   ```sh
   git clone https://github.com/your-repo/Smart_Home_System.git
   cd Smart_Home_System
   ```
2. Compile and run:  
   ```sh
   javac -d out $(find . -name "*.java")
   java -cp out org.Temirjohn.Smart_Home_System.HomeApp
   ```
