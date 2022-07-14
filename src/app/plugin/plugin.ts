import { registerPlugin } from '@capacitor/core';

export interface EchoPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;

  sum(options: { int1: number, int2: number }): Promise<{ response: string }>;
}


const Echo = registerPlugin<any>('Echo');

 export default Echo;