#include <iostream>
#include <string>
using namespace std;

int main() {
    string user, pw;
    cout << "Enter Username: "; cin >> user;
    cout << "Enter Password: "; cin >> pw;

    if (user == "adminKE" && pw == "254Secure") {
        cout << "Access Granted" << endl;
    } else {
        cout << "Invalid Credentials" << endl;
    }
    return 0;
}
