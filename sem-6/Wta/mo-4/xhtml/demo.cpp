#include <bits/stdc++.h>
using namespace std;
int main()
{
        int no_of_queries, storage, output_pkt_size;
        int input_pkt_size, bucket_size, size_left;
        storage = 0;
        no_of_queries = 3;
        bucket_size = 50;
        input_pkt_size = 100;
        int input=rand()%input_pkt_size,pkl=0;
        output_pkt_size = 20;
        for (int i = 0; i < no_of_queries; i++)
        {
                size_left = bucket_size - storage;
                input=rand()%input_pkt_size;

           cout<<"Generated input : "<<input<<" ";
           cout<<" Current bucket size: "<<storage<<" ";

           if( input>size_left ){
           storage+=(size_left);
           pkl=input-size_left;

           }else{
           pkl=0;
           storage+=input;
           }


           cout<<"  Packet loss: "<<pkl<<" ";

           if(output_pkt_size>=storage ){
           storage=0;
           }else{
           storage-=output_pkt_size;
           }

           cout<<"  ngbucket size after output : "<<storage<<endl;
        }
        return 0;
}