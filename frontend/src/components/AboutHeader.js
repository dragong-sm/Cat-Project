import React from "react";

export function Species({ cat }) {
  console.log(cat);
  return (
    <div>
      {cat.map((cat) => (
        <div key={cat.id}>
          <b> " {cat.species} " </b>
        </div>
      ))}
    </div>
  );
}

export function PreviousBtn() {
  return (
    <button>
      <a href="" target="_blank">
        Move to previous page
      </a>
    </button>
  );
}
