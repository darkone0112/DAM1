for $sucursal in /sucursales/sucursal
let $min := max($sucursal/cuenta/saldohaber)
return
<sucursales>
  <sucursal>{$sucursal/[@codigo]}</sucursal>
  <menor>{$min}</menor>
  <nombre>{data($sucursal/cuenta[saldohaber=$min]/nombre)}</nombre>
</sucursales>