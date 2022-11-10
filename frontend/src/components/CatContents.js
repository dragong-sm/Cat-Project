import React from "react";

function CatContents({ cat }) {
  console.log(cat);
  return (
    <div>
      <li>소개</li>
      &nbsp;&nbsp;
      {cat.description}
      <hr></hr>
      <li>출신</li>
      &nbsp;&nbsp;
      {cat.origin}
      <hr></hr>
      <li>성격</li>
      &nbsp;&nbsp;
      {cat.personality}
      <hr></hr>
      <li>체중</li>
      &nbsp;&nbsp;
      {cat.weight}
      <hr></hr>
      <li>털</li>
      &nbsp;&nbsp;
      {cat.hair}
    </div>
  );
}

export default CatContents;
