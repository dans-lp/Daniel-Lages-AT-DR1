import { useMemo, useState } from 'react';
import styles from './Ex6.module.css'


function Ex6() {
   const itens_iniciais = [
      { id: 1, nome: "Tomate", preco: 2.49, quantidade: 3 },
      { id: 2, nome: "Leite", preco: 7.99, quantidade: 2 },
      { id: 3, nome: "Peito de frango", preco: 38.75, quantidade: 1 },
      { id: 4, nome: "Pão brioche", preco: 15.20, quantidade: 1 },
      { id: 5, nome: "Azeite", preco: 11.50, quantidade: 1 },
   ];
   const [rows, setRows] = useState(itens_iniciais);



   const grandTotal = itens_iniciais.reduce((a, i) => a + i.preco * i.quantidade, 0);
   const totalUnits = itens_iniciais.reduce((a, i) => a + i.quantidade, 0);





   return (
      <div className={styles.container}>
         <div className={styles.header}>
         </div>
         <table className={styles.table}>
            <thead>
               <tr>
                  <th>Nome Item</th>
                  <th>Preço(R$)</th>
                  <th>Quantidade</th>
                  <th>Subtotal</th>
                  <th></th>

               </tr>
            </thead>
            <tbody>
               {rows.map(row => (
                  <tr key={row.id}>
                     <td>{row.nome}</td>
                     <td>{row.preco}</td>
                     <td>{row.quantidade}</td>
                     <td>{(row.quantidade * row.preco).toLocaleString(navigator.language, { minimumFractionDigits: 2 })}</td>

                  </tr>
               ))}
            </tbody>
         </table>
         <p>Total Compra: {grandTotal}</p>
         <p>Quantidade total de itens: {totalUnits}</p>
      </div>
   );
}

export default Ex6;