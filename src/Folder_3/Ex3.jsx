import { useState } from "react";
import styles from './Ex3.module.css'

function Ex3() {
   const [count, setCount] = useState(0);
   const [image, setImage] = useState([]);

   const add = () => {
      const addCount = count + 1;
      setCount(addCount);

      const newImage = {
         id: addCount,
         url: `https://placehold.co/100x100/png`
      };

      setImage([...image, newImage]);
   };

   const sub = () => {
      const subCount = count - 1;
      if (count <= 0) {
         return;
      }

      setCount(subCount);
      setImage(image.slice(0, -1));
   };

   return (
      <div className={styles.container}>
         <button onClick={sub}>-</button>
         {count}
         <button onClick={add}>+</button>
         <div className={styles.image_grid}>
            {image.map((img) => (
               <img
                  key={img.id}
                  src={img.url}
                  alt={`Random number ${img.id}`}
               />
            ))}
         </div>
      </div>
   );
}

export default Ex3;