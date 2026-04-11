import styles from './Ex5.module.css'

function Ex5() {

   return (
      <div className={styles.grid_container}>
         <div className={styles.header}>Header</div>
         <div className={styles.global}> Global Menu</div>
         <div className={styles.ads}>Ads</div>
         <div className={styles.context}>Context Menu</div>
         <div className={styles.main}>Main Content</div>
         <div className={styles.footer}>Footer</div>
      </div>
   );
}

export default Ex5;