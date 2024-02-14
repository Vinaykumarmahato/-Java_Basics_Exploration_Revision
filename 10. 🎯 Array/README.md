# Arrays in Programming

## Hindi (सरल शब्दों में):

### Array Kya Hai?

Array ek aisa container hai jo ek hi naam ke neeche kayi values ko store kar sakta hai. Isse samajhne ke liye ise ek line ke dibbe ke roop mein soch sakte hain, jisme alag-alag items ko rakh sakte hain, aur har dibbe ko ek number mila hota hai.

### Kyun Arrays Ka Istemal?

1. **Vyavasthit Storage:** Arrays data ko vyavasthit karne mein madad karte hain. Har piece of information ke liye alag variable ka istemal na karke aap use arrays mein store kar sakte hain.

2. **Aasaan Access:** Aap array ke elements ko unke index (dibbe ka number) ka istemal karke access kar sakte hain. Isse badi set of data ke saath kaam karna aasan ho jata hai.

### Kaise Arrays Kaam Karte Hain:

1. **Indexing:** Har array ke element ka ek unique index hota hai jo 0 se shuru hota hai. Ye hamare line ke dibbo mein number lagane ki tarah hai. Pehla dibba 0, dusra 1, aur aage badhta hai.

2. **Fixed Size:** Arrays ka ek fixed size hota hai, matlab aap decide karte hain ki kitne elements usme honge jab aap use banate hain. Ye size banane ke baad badal nahi sakta.

### Udaharan:

```java
// Integers ke ek array ko size 5 ke sath banaya
int[] numbers = new int[5];

// Array ke elements ko values assign ki gayi
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

// Array ke elements ko access kiya gaya
int value = numbers[2];  // Ye 30 ko represent karta hai

// Printing all elements in the array
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}





