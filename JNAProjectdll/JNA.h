#include <iostream>

using namespace std;

extern "C" __declspec(dllexport) int Add(int n1, int n2);
extern "C" __declspec(dllexport) int Subtract(int n1, int n2);
extern "C" __declspec(dllexport) int Multiply(int n1, int n2);
extern "C" __declspec(dllexport) int Divide(int n1, int n2);
