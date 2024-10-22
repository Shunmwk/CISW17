#include <iostream>
#include<iomanip>
#include <cstdlib>

int randRange(int, int);

double randDouble();

int main(int argc, char const *argv[])
{
    int a {};

    int count{};

    std:: cout <<RAND_MAX << std::endl;


    while (count < 100)
    {
    std:: cout << std:: left << std:: setprecision(6) << std:: setw(10) << randDouble() << ' '; 
    if(count % 10 == 0) std::cout<< std:: endl;

    ++count;
    }


    std:: cout<< std::endl;
    return 0;
}

int randRange(int start, int end){

    return rand() % (end - start +1) + start;

}
double randDouble(){
    return static_cast <double> (rand()) / RAND_MAX;
}
