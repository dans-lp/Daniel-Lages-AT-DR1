import styles from './Ex2.module.css'
import { LuAlignJustify } from "react-icons/lu";

function Ex2() {

   return (
      <>
         <div className={styles.box}>

            <div className={styles.menu_horizontal}>
               <div className={styles.menu_logo}>
                  <img src="src/assets/logoipsum-393.png" alt="" />
               </div>
               <div className={styles.menu_icon}>
                  <LuAlignJustify />
               </div>
            </div>
            <ul className={styles.menu_items}>
               <li>Perfil</li>
               <li>Postagens</li>
               <li>Amigos</li>
               <li>Fotos</li>
               <li>Videos</li>
               <li>Configurações</li>
            </ul>
         </div>
      </>
   );
}

export default Ex2;