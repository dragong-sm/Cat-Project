import React from "react";

function CatContents({ catProfile }) {
  // console.log(catProfile);
  return (
    <div>
      <li>소개</li>
      &nbsp;&nbsp;
      {catProfile.description}
      <hr></hr>
      <li>출신</li>
      &nbsp;&nbsp;
      {catProfile.origin}
      <hr></hr>
      <li>성격</li>
      &nbsp;&nbsp;
      {catProfile.personality}
      <hr></hr>
      <li>체중</li>
      &nbsp;&nbsp;
      {catProfile.weight}
      <hr></hr>
      <li>털</li>
      &nbsp;&nbsp;
      {catProfile.hair}
    </div>
  );
}

export default CatContents;
