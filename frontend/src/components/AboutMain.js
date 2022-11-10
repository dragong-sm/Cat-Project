import React from "react";

function AboutMain({ pictures, cats }) {
  return (
    <div>
      {pictures.map((picture) => (
        <div key={pictures.id}>
          <MainImage src={picture.photoURL[0]}></MainImage>
        </div>
      ))}
      <Contents>
        {cats.map((cat) => (
          <div key={cat.id}></div>
        ))}
      </Contents>
    </div>
  );
}

export default AboutMain;
