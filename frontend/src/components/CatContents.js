import React from "react";

function CatContents({ cats }) {
  // console.log(catProfile);
  return (
    <div>
      <li>소개</li>
      &nbsp;&nbsp;
      {cats.description}
      <hr></hr>
      <li>출신</li>
      &nbsp;&nbsp;
      {cats.origin}
      <hr></hr>
      <li>성격</li>
      &nbsp;&nbsp;
      {cats.personality}
      <hr></hr>
      <li>체중</li>
      &nbsp;&nbsp;
      {cats.weight}
      <hr></hr>
      <li>털</li>
      &nbsp;&nbsp;
      {cats.hair}
    </div>
  );
}

export default CatContents;
