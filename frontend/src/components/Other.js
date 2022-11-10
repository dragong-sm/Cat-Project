import React from "react";

function Other({ onUpdateToggle }) {
  return (
    <div>
      <a
        onClick={() => {
          onUpdateToggle();
        }}
      >
        다른 종류 검색하기
      </a>

      <div>{/* 고양이 종류 링크 리스트 넣기 */}</div>
    </div>
  );
}

export default Other;
