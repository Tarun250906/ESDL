#include <iostream>
using namespace std;

int phi(int n){
    int result = n;

    for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
    while (n % i == 0)
    n /= i;
    result -= result / i;
    }
    }
    if (n > 1)
        result -= result / n;

    return result;
}

int main(){
    int N;
    cout << "Enter a number N: ";
    cin >> N;
    int coprimeCount = phi(N);
    cout << "Count of numbers coprime with " << N << " in the range 1 to " << N << " is: " << coprimeCount << "\n";
    return 0;
}
