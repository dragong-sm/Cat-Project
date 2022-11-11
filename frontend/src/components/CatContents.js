import React from "react";

function CatContents({ cats }) {
  // console.log(cats);

  return (
    <div>
      <h3> 📌 소개</h3>
      &nbsp;&nbsp;▪&nbsp;&nbsp;
      {cats.description}
      <h3> 📌 출신</h3>
      &nbsp;&nbsp;▪&nbsp;&nbsp;
      {cats.origin}
      <h3> 📌 성격</h3>
      &nbsp;&nbsp;▪&nbsp;&nbsp;
      {cats.temper}
      <h3> 📌 체중</h3>
      &nbsp;&nbsp;▪&nbsp;&nbsp;
      {cats.size}
      <h3>📌 털</h3>
      &nbsp;&nbsp;▪&nbsp;&nbsp;
      {cats.hairType}
    </div>
  );
}

export default CatContents;
