import Other from "../components/Other";
import Pictures from "../components/Pictures";
import React, { useState } from "react";

export function Home({cats}) {
  const [UpdateToggle, setUpdateToggle] = useState(false);
  const onUpdateToggle = () => {
    setUpdateToggle(!UpdateToggle);
  };

  return (
    <div>
      <h1>Cat 검색</h1>
      <br />
      <div>
        <Pictures cats={cats}/>
      </div>

      <br />
      <div>
        <Other cats={cats}/>
      </div>
    </div>
  );
}
