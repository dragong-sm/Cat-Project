import logo from "./logo.svg";
import "./App.css";
import { Home } from "./pages/Home";
import { About } from "./pages/About";
import { useState } from "react";

function App() {
  return (
    <div className="App">
      <Home />
      <About />
      {/* 1. 주요 5 고양이 : Home에서 사진 클릭하면 id? catname? About에서 받기 */}
      {/* 2. Other : Home에서 이름을 클릭하면 id? catname? About에서 받기 */}
      {/* 3. aboutToggle이 true이면 해당 고양이 about 페이지로 이동 ! */}
    </div>
  );
}

export default App;
