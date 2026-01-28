
# Create output directories
New-Item -ItemType Directory -Force -Path "out/api"
New-Item -ItemType Directory -Force -Path "out/producer"
New-Item -ItemType Directory -Force -Path "out/consumer"

# Compile api
Write-Host "Compiling api..."
javac -d out/api api.module/src/main/java/module-info.java api.module/src/main/java/com/exemple/api/Greeting.java

# Compile producer
Write-Host "Compiling producer..."
javac -d out/producer --module-path out/api producer.module/src/main/java/module-info.java producer.module/src/main/java/com/exemple/producer/GreetingImpl.java

# Compile consumer
Write-Host "Compiling consumer..."
javac -d out/consumer --module-path out/api consumer.module/src/main/java/module-info.java consumer.module/src/main/java/com/exemple/consumer/Main.java

# Run WITHOUT producer (Reproduction of failure)
Write-Host "`n--- Running WITHOUT producer (Expected: No output) ---"
java --module-path "out/api;out/consumer" -m consumer.module/com.exemple.consumer.Main

# Run WITH producer (Fix)
Write-Host "`n--- Running WITH producer (Expected: Hello youness) ---"
java --module-path "out/api;out/consumer;out/producer" -m consumer.module/com.exemple.consumer.Main
