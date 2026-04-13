import { useState } from 'react';
import styles from './Ex6.module.css'

function Item({ alterarQuantidade, index, id, nome, preco, quantidade }) {

   return (
      <tr key={id}>
         <td>{nome}</td>
         <td>{preco}</td>
         <td>
            <button className={styles.button} onClick={() => alterarQuantidade(index, quantidade - 1)}>-</button>
            <span>{quantidade}</span>
            <button className={styles.button} onClick={() => alterarQuantidade(index, quantidade + 1)}>+</button>
         </td>
         <td>{(quantidade * preco).toLocaleString(navigator.language, { minimumFractionDigits: 2 })}</td>
      </tr>
   )
}

function Ex6() {
   const itens_iniciais = [
      { id: 1, nome: "Tomate", preco: 2.49, quantidade: 3 },
      { id: 2, nome: "Leite", preco: 7.99, quantidade: 2 },
      { id: 3, nome: "Peito de frango", preco: 38.75, quantidade: 1 },
      { id: 4, nome: "Pão brioche", preco: 15.20, quantidade: 1 },
      { id: 5, nome: "Azeite", preco: 11.50, quantidade: 1 },
   ];
   const [rows, setRows] = useState(itens_iniciais);

   const alterarQuantidade = (index, quantidade) => {
      if (quantidade < 0) {
         return;
      }

      const rowsCpy = [...rows];

      rowsCpy[index].quantidade = quantidade;
      setRows(rowsCpy);
   };

   let sum = 0;
   let qtd = 0;
   let maiorCusto = { nome: 'N/A', total: 0 };

   rows.forEach((item) => {
      const valorTotal = item.preco * item.quantidade;
      sum += valorTotal;
      qtd += item.quantidade;

      if (valorTotal > maiorCusto.total) {
         maiorCusto = { nome: item.nome, total: valorTotal }
      }
   });

   return (
      <div className={styles.container}>
         <div className={styles.header}>
            <h3>
               Compras Mercado
            </h3>
         </div>
         <div className={styles.infos}>
            <p>Total Compra: <br />R${sum.toLocaleString(navigator.language, { minimumFractionDigits: 2 })}</p>
            <p>Quantidade total: <br />{qtd}</p>
            <p>Item de Maior custo: <br />{maiorCusto.nome}</p>

         </div>
         <table className={styles.table}>
            <thead>
               <tr>
                  <th>Nome Item</th>
                  <th>Preço(R$)</th>
                  <th>Quantidade</th>
                  <th>Subtotal</th>
               </tr>
            </thead>
            <tbody>
               {rows.map((row, index) => <Item alterarQuantidade={alterarQuantidade} index={index} {...row} />)}
            </tbody>
         </table>
      </div>
   );
}

export default Ex6;