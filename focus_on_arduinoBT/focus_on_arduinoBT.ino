#include <SoftwareSerial.h>
int Tx=6;
int Rx=7;

SoftwareSerial BT(Tx,Rx);

int sensor = A0;
int val;
int state;

unsigned long time_pre=0;
unsigned long time_cur;

void setup(){
  Serial.begin(9600);
  BT.begin(9600);
  pinMode(sensor,INPUT);
  state=0;
}

void loop(){
  time_cur=millis();
  val=analogRead(sensor);
  
  if(BT.available()) {
    Serial.write(BT.read());
  }
  if(Serial.available()) {
    BT.write(Serial.read());
  }

  if(time_cur - time_pre >=200){
    time_pre=time_cur;
    if(val < 50){
      state=1;
      Serial.println(val);
      Serial.println(state); 
      BT.println(state);
    }
    else{
      state=0;
      Serial.println(val);
      Serial.println(state);
      BT.println(state);
    }
  }
}
