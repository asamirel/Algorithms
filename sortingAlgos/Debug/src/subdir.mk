################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/bubbleSorting.cpp \
../src/insertionSort.cpp \
../src/selectionSort.cpp 

OBJS += \
./src/bubbleSorting.o \
./src/insertionSort.o \
./src/selectionSort.o 

CPP_DEPS += \
./src/bubbleSorting.d \
./src/insertionSort.d \
./src/selectionSort.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cross G++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


