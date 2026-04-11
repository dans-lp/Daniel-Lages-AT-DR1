import styles from './Ex1.module.css'
import { LuCircleUser } from "react-icons/lu";

function Ex1() {

   return (
      <div className={styles.menu_horizontal}>
         <div className={styles.menu_logo}>
            <img src="src/assets/logoipsum-394.png" alt="" />
         </div>
         <ul className={styles.menu_items}>
            <li>Produtos</li>
            <li>Serviços</li>
            <li>Contatos</li>
         </ul>
         <div className={styles.menu_icon}>
            <LuCircleUser />
         </div>
      </div>
   );
}

export default Ex1;