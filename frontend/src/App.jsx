import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'

function App() {
  return (
    <div style={{ padding: "40px", fontFamily: "Arial" }}>
      <h1>Mini CI/CD Project</h1>

      <p>React frontend is running successfully.</p>

      <h2>Backend APIs</h2>

      <ul>
        <li>GET /api/hello</li>
        <li>GET /api/info</li>
        <li>GET /api/status</li>
        <li>POST /api/message</li>
      </ul>
    </div>
  );
}

export default App;