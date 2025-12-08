"""
Multipurpose Converter
Modules:
1. Temperature (Celsius, Fahrenheit, Kelvin)
2. Length (km, m, cm, inches, feet)
3. Weight (kg, pounds, grams)
4. Speed (km/h, m/s, mph)
"""

def safe_float(prompt):
    while True:
        s = input(prompt).strip()
        try:
            return float(s)
        except ValueError:
            print("Please enter a valid number (e.g. 12.5 or -3).")

def choose_from_list(options, prompt="Choose an option: "):
    for i, opt in enumerate(options, start=1):
        print(f"{i}. {opt}")
    while True:
        choice = input(prompt).strip()
        if choice.isdigit():
            idx = int(choice)
            if 1 <= idx <= len(options):
                return idx - 1
        print("Invalid choice. Enter the number shown beside an option.")

# ---------------- Temperature ----------------
def c_to_f(c): return (c * 9.0/5.0) + 32.0
def f_to_c(f): return (f - 32.0) * 5.0/9.0
def c_to_k(c): return c + 273.15
def k_to_c(k): return k - 273.15

def temperature_converter():
    units = ["Celsius (C)", "Fahrenheit (F)", "Kelvin (K)"]
    short = ["C", "F", "K"]
    print("\nTemperature Converter")
    src = choose_from_list(units, "Select source unit: ")
    tgt = choose_from_list(units, "Select target unit: ")
    value = safe_float(f"Enter temperature in {short[src]}: ")
    # normalize to Celsius as intermediate
    if short[src] == "C":
        c = value
    elif short[src] == "F":
        c = f_to_c(value)
    else:
        c = k_to_c(value)
    # convert Celsius to target
    if short[tgt] == "C":
        result = c
    elif short[tgt] == "F":
        result = c_to_f(c)
    else:
        result = c_to_k(c)
    print(f"{value} {short[src]} = {result:.4f} {short[tgt]}")

# ---------------- Length ----------------
# Use meters as base unit
length_factors_to_m = {
    "km": 1000.0,
    "m": 1.0,
    "cm": 0.01,
    "inch": 0.0254,
    "ft": 0.3048
}

def length_converter():
    units = ["kilometer (km)", "meter (m)", "centimeter (cm)", "inch (inch)", "foot (ft)"]
    short = ["km","m","cm","inch","ft"]
    print("\nLength Converter")
    src = choose_from_list(units, "Select source unit: ")
    tgt = choose_from_list(units, "Select target unit: ")
    value = safe_float(f"Enter length in {short[src]}: ")
    # to meters
    meters = value * length_factors_to_m[short[src]]
    # to target
    result = meters / length_factors_to_m[short[tgt]]
    print(f"{value} {short[src]} = {result:.6f} {short[tgt]}")

# ---------------- Weight ----------------
# use kilograms as base
weight_to_kg = {
    "kg": 1.0,
    "pound": 0.45359237,
    "g": 0.001
}

def weight_converter():
    units = ["kilogram (kg)", "pound (lb)", "gram (g)"]
    short = ["kg","pound","g"]
    print("\nWeight Converter")
    src = choose_from_list(units, "Select source unit: ")
    tgt = choose_from_list(units, "Select target unit: ")
    value = safe_float(f"Enter weight in {short[src]}: ")
    kg = value * weight_to_kg[short[src]]
    result = kg / weight_to_kg[short[tgt]]
    print(f"{value} {short[src]} = {result:.6f} {short[tgt]}")

# ---------------- Speed ----------------
# base: meters per second (m/s)
speed_to_ms = {
    "km/h": 1000.0/3600.0,
    "m/s": 1.0,
    "mph": 1609.344/3600.0
}

def speed_converter():
    units = ["kilometer/hour (km/h)", "meter/second (m/s)", "mile/hour (mph)"]
    short = ["km/h","m/s","mph"]
    print("\nSpeed Converter")
    src = choose_from_list(units, "Select source unit: ")
    tgt = choose_from_list(units, "Select target unit: ")
    value = safe_float(f"Enter speed in {short[src]}: ")
    ms = value * speed_to_ms[short[src]]
    result = ms / speed_to_ms[short[tgt]]
    print(f"{value} {short[src]} = {result:.6f} {short[tgt]}")

# ---------------- Main Menu ----------------
def main_menu():
    modules = [
        "Temperature Converter",
        "Length Converter",
        "Weight Converter",
        "Speed Converter",
        "Exit"
    ]
    while True:
        print("\n=== MULTIPURPOSE CONVERTER ===")
        choice = choose_from_list(modules, "Choose a module: ")
        if choice == 0:
            temperature_converter()
        elif choice == 1:
            length_converter()
        elif choice == 2:
            weight_converter()
        elif choice == 3:
            speed_converter()
        else:
            print("Goodbye!")
            break
        # after each conversion ask continue or return
        post = input("\nPress Enter to return to main menu or type 'exit' to quit: ").strip().lower()
        if post == "exit":
            print("Goodbye!")
            break

if __name__ == "__main__":
    main_menu()
